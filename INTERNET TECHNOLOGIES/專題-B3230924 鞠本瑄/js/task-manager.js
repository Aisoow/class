// 完成品
class TaskManager {
    constructor() {
        this.tasks = this.loadTasks();
        this.deleteTaskId = null; // 用於存儲要刪除的任務 ID
        this.init();
    }
    // 存檔點
    init() {
        this.renderTasks();
        this.updateUpcomingEvent();
        this.startCountdownTimer();
        this.setupEventListeners();
        this.initBootstrapFeatures();
        this.updateStatistics();
    }

    // 初始化 Bootstrap 功能
    initBootstrapFeatures() {
        // 檢查 Bootstrap 是否載入
        if (typeof bootstrap === 'undefined') {
            console.warn('Bootstrap JavaScript 未載入，使用傳統通知方式');
            return;
        }

        // 初始化 Bootstrap Toast
        const toastElement = document.getElementById('liveToast');
        if (toastElement) {
            this.toastElement = toastElement;
            this.toast = new bootstrap.Toast(toastElement, {
                autohide: true,
                delay: 3000
            });
        }

        // 初始化刪除確認 Modal
        const deleteModalElement = document.getElementById('deleteConfirmModal');
        if (deleteModalElement) {
            this.deleteModal = new bootstrap.Modal(deleteModalElement, {
                backdrop: 'static',
                keyboard: true,
                focus: true
            });

            // 設定確認刪除按鈕事件
            const confirmBtn = document.getElementById('confirmDeleteBtn');
            if (confirmBtn) {
                confirmBtn.addEventListener('click', () => {
                    this.confirmDelete();
                });
            }

            // 處理 Modal 顯示和隱藏事件
            deleteModalElement.addEventListener('shown.bs.modal', () => {
                const confirmBtn = document.getElementById('confirmDeleteBtn');
                if (confirmBtn) {
                    confirmBtn.focus();
                }
            });

            deleteModalElement.addEventListener('hidden.bs.modal', () => {
                this.deleteTaskId = null;
            });
        }
    }

    setupEventListeners() {
        // 表單提交事件
        document.getElementById('taskForm').addEventListener('submit', (e) => {
            e.preventDefault();
            this.addTask();
        });

        // 點擊彈窗外部關閉
        window.addEventListener('click', (e) => {
            const modal = document.getElementById('taskModal');
            if (e.target === modal) {
                this.closeModal();
            }
        });

        // ESC 鍵關閉彈窗
        document.addEventListener('keydown', (e) => {
            if (e.key === 'Escape') {
                this.closeModal();
            }
        });
    }

    loadTasks() {
        const stored = localStorage.getItem('taskManagerData');
        if (stored) {
            try {
                const tasks = JSON.parse(stored);
                // 確保日期物件正確轉換
                return tasks.map(task => ({
                    ...task,
                    date: new Date(task.date),
                    created: new Date(task.created || Date.now())
                }));
            } catch (error) {
                console.error('載入任務資料失敗:', error);
                return [];
            }
        }
        return [];
    }

    saveTasks() {
        try {
            localStorage.setItem('taskManagerData', JSON.stringify(this.tasks));
        } catch (error) {
            console.error('儲存任務資料失敗:', error);
            this.showNotification('儲存失敗，請檢查瀏覽器儲存空間', 'danger');
        }
    }

    addTask() {
        const name = document.getElementById('taskName').value.trim();
        const date = document.getElementById('taskDate').value;
        const details = document.getElementById('taskDetails').value.trim();

        if (!name || !date) {
            this.showNotification('請填寫事件名稱和日期！', 'danger');
            return;
        }

        const taskDate = new Date(date);
        if (taskDate < new Date()) {
            if (!confirm('您選擇的時間已經過去，確定要新增這個任務嗎？')) {
                return;
            }
        }

        const task = {
            id: Date.now(),
            name,
            date: taskDate,
            details,
            created: new Date(),
            completed: false
        };

        this.tasks.push(task);
        this.saveTasks();
        this.renderTasks();
        this.updateUpcomingEvent();
        this.updateStatistics();
        this.closeModal();
        this.resetForm();

        this.showNotification('✅ 事項新增成功！', 'success');
    }

    // 使用 Bootstrap Modal 的刪除確認
    deleteTask(taskId) {
        const task = this.tasks.find(t => t.id === taskId);
        if (!task) return;

        this.deleteTaskId = taskId;

        // 清除可能的覆蓋元素
        this.clearOverlays();

        // 如果有 Bootstrap Modal，使用它
        if (this.deleteModal) {
            const deleteTaskNameEl = document.getElementById('deleteTaskName');
            if (deleteTaskNameEl) {
                deleteTaskNameEl.textContent = task.name;
            }

            // 添加視覺反饋
            const taskElement = document.querySelector(`[data-task-id="${taskId}"]`);
            if (taskElement) {
                taskElement.style.transform = 'scale(0.98)';
                taskElement.style.opacity = '0.8';
            }

            // 延遲顯示以確保動畫效果
            setTimeout(() => {
                this.deleteModal.show();
            }, 100);
        } else {
            // 備用：使用傳統確認對話框
            if (confirm(`確定要刪除「${task.name}」嗎？`)) {
                this.confirmDelete();
            }
        }
    }

    // 確認刪除方法
    confirmDelete() {
        if (this.deleteTaskId) {
            const taskElement = document.querySelector(`[data-task-id="${this.deleteTaskId}"]`);

            // 添加刪除動畫
            if (taskElement) {
                taskElement.style.transition = 'all 0.3s ease';
                taskElement.style.transform = 'translateX(-100%)';
                taskElement.style.opacity = '0';
            }

            // 延遲實際刪除以顯示動畫
            setTimeout(() => {
                this.tasks = this.tasks.filter(task => task.id !== this.deleteTaskId);
                this.saveTasks();
                this.renderTasks();
                this.updateUpcomingEvent();
                this.updateStatistics();

                if (this.deleteModal) {
                    this.deleteModal.hide();
                }

                this.showNotification('🗑️ 任務已成功刪除', 'success');
                this.deleteTaskId = null;
            }, 300);
        }
    }

    clearAllTasks() {
        if (this.tasks.length === 0) {
            this.showNotification('沒有任務可以清空', 'warning');
            return;
        }

        if (confirm('確定要清空所有事項嗎？此操作無法復原！')) {
            this.tasks = [];
            this.saveTasks();
            this.renderTasks();
            this.updateUpcomingEvent();
            this.updateStatistics();
            this.showNotification('🗑️ 所有事項已清空', 'info');
        }
    }

    renderTasks() {
        const taskList = document.getElementById('taskList');
        taskList.innerHTML = '';

        if (this.tasks.length === 0) {
            taskList.innerHTML = `
                <div class="empty-state">
                    <h3>📝 還沒有任何代辦事項</h3>
                    <p>點擊上方的「新增事項」按鈕來建立您的第一個任務吧！</p>
                </div>
            `;
            return;
        }

        // 依照狀態和時間排序任務
        const sortedTasks = this.tasks.sort((a, b) => {
            const now = new Date();
            const dateA = new Date(a.date);
            const dateB = new Date(b.date);

            // 已完成的任務排在最後
            if (a.completed && !b.completed) return 1;
            if (!a.completed && b.completed) return -1;

            // 檢查任務是否過期（未完成的任務）
            if (!a.completed && !b.completed) {
                const isExpiredA = dateA < now;
                const isExpiredB = dateB < now;

                // 如果一個過期一個沒過期，未過期的排前面
                if (isExpiredA && !isExpiredB) return 1;
                if (!isExpiredA && isExpiredB) return -1;
            }

            // 如果都是同樣狀態，按時間排序
            return dateA - dateB;
        });

        sortedTasks.forEach((task, index) => {
            const taskElement = this.createTaskElement(task, index);
            taskList.appendChild(taskElement);
        });

        this.updateUpcomingEvent();
        this.updateStatistics();
    }

    createTaskElement(task, index) {
        const taskDate = new Date(task.date);
        const countdown = this.getCountdown(taskDate);
        const isExpired = taskDate < new Date() && !task.completed;
        const isSoon = !isExpired && !task.completed && this.getDaysUntil(taskDate) <= 3;
        const isCompleted = task.completed;

        const taskElement = document.createElement('div');
        taskElement.className = `task-item ${isExpired ? 'expired' : ''} ${isCompleted ? 'completed' : ''}`;
        taskElement.setAttribute('data-task-id', task.id);

        // 使用與新增事項相同的按鈕樣式，移除編輯按鈕
        taskElement.innerHTML = `
            <div class="task-header">
                <div class="task-name ${isCompleted ? 'text-decoration-line-through text-muted' : ''}">
                    ${isCompleted ? '✅ ' : ''}${this.escapeHtml(task.name)}
                </div>
                <div class="task-actions">
                    <div class="task-button-group">
                        ${!isCompleted ? `
                            <button class="btn task-complete-btn" 
                                    onclick="taskManager.markComplete(${task.id})" 
                                    title="標記為完成">
                                ✅ 完成
                            </button>
                        ` : `
                            <button class="btn task-restore-btn" 
                                    onclick="taskManager.markIncomplete(${task.id})" 
                                    title="恢復為進行中">
                                🔄 恢復
                            </button>
                        `}
                        <button class="btn task-delete-btn" 
                                onclick="taskManager.deleteTask(${task.id})" 
                                title="刪除任務">
                            🗑️ 刪除
                        </button>
                    </div>
                </div>
            </div>
            <div class="task-info">
                <div class="task-date">
                    <i class="bi bi-calendar-event me-1"></i>
                    ${this.formatDate(taskDate)}
                </div>
                <div class="task-countdown ${isExpired ? 'expired' : isSoon ? 'soon' : ''}">
                    <i class="bi bi-stopwatch me-1"></i>
                    ${isCompleted ? '已完成' : countdown}
                </div>
            </div>
            ${task.details ? `
                <div class="task-details ${isCompleted ? 'text-muted' : ''}">
                    <i class="bi bi-journal-text me-2"></i>
                    ${this.escapeHtml(task.details)}
                </div>
            ` : ''}
            ${isCompleted ? `
                <div class="completion-info">
                    <small class="text-muted">
                        <i class="bi bi-check-circle-fill text-success me-1"></i>
                        完成於：${this.formatDate(new Date(task.completedAt))}
                    </small>
                </div>
            ` : ''}
        `;

        return taskElement;
    }

    // 統計資訊更新
    updateStatistics() {
        const now = new Date();
        const total = this.tasks.length;
        const completed = this.tasks.filter(task => task.completed).length;
        const pending = this.tasks.filter(task => !task.completed && new Date(task.date) >= now).length;
        const expired = this.tasks.filter(task => !task.completed && new Date(task.date) < now).length;
        const urgent = this.tasks.filter(task => {
            if (task.completed) return false;
            const days = this.getDaysUntil(new Date(task.date));
            return days <= 3 && days > 0;
        }).length;

        // 更新統計卡片（如果存在）
        this.updateElementText('totalCount', total);
        this.updateElementText('pendingCount', pending);
        this.updateElementText('expiredCount', expired);
        this.updateElementText('urgentCount', urgent);
        this.updateElementText('completedCount', completed);

        // 更新統計表格（如果存在）
        this.updateElementText('tableTotal', total);
        this.updateElementText('tablePending', pending);
        this.updateElementText('tableExpired', expired);
        this.updateElementText('tableUrgent', urgent);
        this.updateElementText('tableCompleted', completed);

        // 計算並更新百分比和進度條
        if (total > 0) {
            const pendingPercent = Math.round((pending / total) * 100);
            const expiredPercent = Math.round((expired / total) * 100);
            const urgentPercent = Math.round((urgent / total) * 100);
            const completedPercent = Math.round((completed / total) * 100);

            this.updateElementText('pendingPercent', `${pendingPercent}%`);
            this.updateElementText('expiredPercent', `${expiredPercent}%`);
            this.updateElementText('urgentPercent', `${urgentPercent}%`);
            this.updateElementText('completedPercent', `${completedPercent}%`);

            this.updateProgressBar('pendingProgress', pendingPercent);
            this.updateProgressBar('expiredProgress', expiredPercent);
            this.updateProgressBar('urgentProgress', urgentPercent);
            this.updateProgressBar('completedProgress', completedPercent);
        } else {
            // 重置為 0
            ['pendingPercent', 'expiredPercent', 'urgentPercent', 'completedPercent'].forEach(id => {
                this.updateElementText(id, '0%');
            });
            ['pendingProgress', 'expiredProgress', 'urgentProgress', 'completedProgress'].forEach(id => {
                this.updateProgressBar(id, 0);
            });
        }
    }

    // 輔助方法：更新元素文字
    updateElementText(id, text) {
        const element = document.getElementById(id);
        if (element) {
            element.textContent = text;
        }
    }

    // 輔助方法：更新進度條
    updateProgressBar(id, percent) {
        const element = document.getElementById(id);
        if (element) {
            element.style.width = `${percent}%`;
        }
    }

    // 標記完成功能
    markComplete(taskId) {
        const taskIndex = this.tasks.findIndex(task => task.id === taskId);
        if (taskIndex !== -1) {
            this.tasks[taskIndex].completed = true;
            this.tasks[taskIndex].completedAt = new Date();
            this.saveTasks();
            this.renderTasks();
            this.updateStatistics();
            this.showNotification('✅ 任務已標記為完成！', 'success');
        }
    }

    // 取消完成功能
    markIncomplete(taskId) {
        const taskIndex = this.tasks.findIndex(task => task.id === taskId);
        if (taskIndex !== -1) {
            this.tasks[taskIndex].completed = false;
            delete this.tasks[taskIndex].completedAt;
            this.saveTasks();
            this.renderTasks();
            this.updateStatistics();
            this.showNotification('↶ 任務已標記為未完成', 'info');
        }
    }

    // 編輯任務功能（佔位符）
    editTask(taskId) {
        this.showNotification('📝 編輯功能開發中...', 'info');
    }

    // 統一的通知方法
    showNotification(message, type = 'info') {
        // 如果有 Bootstrap Toast，優先使用
        if (this.toast && this.toastElement) {
            this.showBootstrapNotification(message, type);
        } else {
            // 備用：使用自定義通知
            this.showCustomNotification(message, type);
        }
    }

    // Bootstrap Toast 通知
    showBootstrapNotification(message, type = 'primary') {
        const toastMessage = document.getElementById('toastMessage');
        const toastHeader = this.toastElement.querySelector('.toast-header');

        if (!toastMessage || !toastHeader) return;

        // 設定訊息
        toastMessage.textContent = message;

        // 設定樣式
        const typeColors = {
            success: 'text-success',
            danger: 'text-danger',
            warning: 'text-warning',
            info: 'text-info',
            primary: 'text-primary'
        };

        const icon = toastHeader.querySelector('i');
        if (icon) {
            icon.className = `bi bi-bell-fill me-2 ${typeColors[type] || typeColors.primary}`;
        }

        // 顯示 Toast
        this.toast.show();
    }

    // 自定義通知
    showCustomNotification(message, type = 'info') {
        const notification = document.createElement('div');
        notification.className = `notification notification-${type}`;
        notification.textContent = message;

        // 設定樣式
        Object.assign(notification.style, {
            position: 'fixed',
            top: '20px',
            right: '20px',
            padding: '15px 20px',
            borderRadius: '8px',
            color: 'white',
            fontWeight: 'bold',
            zIndex: '2000',
            boxShadow: '0 4px 12px rgba(0,0,0,0.3)',
            transform: 'translateX(100%)',
            transition: 'transform 0.3s ease'
        });

        // 設定背景色
        const colors = {
            success: '#28a745',
            danger: '#dc3545',
            warning: '#ffc107',
            info: '#17a2b8',
            primary: '#007bff'
        };
        notification.style.background = colors[type] || colors.info;

        document.body.appendChild(notification);

        // 動畫顯示
        setTimeout(() => {
            notification.style.transform = 'translateX(0)';
        }, 100);

        // 自動移除
        setTimeout(() => {
            notification.style.transform = 'translateX(100%)';
            setTimeout(() => {
                if (notification.parentNode) {
                    document.body.removeChild(notification);
                }
            }, 300);
        }, 3000);
    }

    updateUpcomingEvent() {
        const now = new Date();
        const upcomingTasks = this.tasks
            .filter(task => !task.completed && new Date(task.date) >= now)
            .sort((a, b) => new Date(a.date) - new Date(b.date));

        const eventNameEl = document.getElementById('eventName');
        const eventDateEl = document.getElementById('eventDate');
        const countdownEl = document.getElementById('countdown');

        if (!eventNameEl || !eventDateEl || !countdownEl) return;

        if (upcomingTasks.length === 0) {
            eventNameEl.textContent = '暫無即將到來的事件';
            eventDateEl.textContent = '';
            countdownEl.textContent = '--';
            return;
        }

        const nextTask = upcomingTasks[0];
        const taskDate = new Date(nextTask.date);

        eventNameEl.textContent = nextTask.name;
        eventDateEl.textContent = this.formatDate(taskDate);
        countdownEl.textContent = this.getCountdown(taskDate);
    }

    getCountdown(targetDate) {
        const now = new Date();
        const diff = targetDate - now;

        if (diff <= 0) {
            return '已過期';
        }

        const days = Math.floor(diff / (1000 * 60 * 60 * 24));
        const hours = Math.floor((diff % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
        const minutes = Math.floor((diff % (1000 * 60 * 60)) / (1000 * 60));

        if (days > 0) {
            return `${days}天 ${hours}小時`;
        } else if (hours > 0) {
            return `${hours}小時 ${minutes}分鐘`;
        } else {
            return `${minutes}分鐘`;
        }
    }

    getDaysUntil(targetDate) {
        const now = new Date();
        const diff = targetDate - now;
        return Math.ceil(diff / (1000 * 60 * 60 * 24));
    }

    formatDate(date) {
        return date.toLocaleString('zh-TW', {
            year: 'numeric',
            month: 'long',
            day: 'numeric',
            hour: '2-digit',
            minute: '2-digit',
            weekday: 'long'
        });
    }

    escapeHtml(text) {
        const div = document.createElement('div');
        div.textContent = text;
        return div.innerHTML;
    }

    startCountdownTimer() {
        setInterval(() => {
            this.updateUpcomingEvent();

            // 更新所有任務的倒數計時
            const taskItems = document.querySelectorAll('.task-countdown');
            taskItems.forEach((item, index) => {
                const visibleTasks = this.tasks.filter(task => !task.completed);
                if (visibleTasks[index]) {
                    const taskDate = new Date(visibleTasks[index].date);
                    const countdown = this.getCountdown(taskDate);
                    const isExpired = taskDate < new Date();
                    const isSoon = !isExpired && this.getDaysUntil(taskDate) <= 3;

                    item.textContent = `⏰ ${countdown}`;
                    item.className = `task-countdown ${isExpired ? 'expired' : isSoon ? 'soon' : ''}`;
                }
            });
        }, 60000); // 每分鐘更新一次
    }

    openAddModal() {
        const modal = document.getElementById('taskModal');
        if (modal) {
            modal.style.display = 'block';
            const taskNameInput = document.getElementById('taskName');
            if (taskNameInput) {
                taskNameInput.focus();
            }
        }
    }

    closeModal() {
        const modal = document.getElementById('taskModal');
        if (modal) {
            modal.style.display = 'none';
            this.resetForm();
        }
    }

    resetForm() {
        const form = document.getElementById('taskForm');
        if (form) {
            form.reset();
            form.classList.remove('was-validated');
        }
    }

    exportTasks() {
        if (this.tasks.length === 0) {
            this.showNotification('沒有任務可以匯出！', 'warning');
            return;
        }

        try {
            const dataStr = JSON.stringify(this.tasks, null, 2);
            const dataBlob = new Blob([dataStr], { type: 'application/json' });
            const url = URL.createObjectURL(dataBlob);

            const link = document.createElement('a');
            link.href = url;
            link.download = `task-backup-${new Date().toISOString().split('T')[0]}.json`;
            link.click();

            URL.revokeObjectURL(url);
            this.showNotification('📤 資料匯出成功！', 'success');
        } catch (error) {
            console.error('匯出失敗:', error);
            this.showNotification('匯出失敗，請重試', 'danger');
        }
    }

    importTasks(event) {
        const file = event.target.files[0];
        if (!file) return;

        const reader = new FileReader();
        reader.onload = (e) => {
            try {
                const importedTasks = JSON.parse(e.target.result);

                if (!Array.isArray(importedTasks)) {
                    throw new Error('檔案格式不正確');
                }

                // 驗證匯入的資料格式
                const validTasks = importedTasks.filter(task =>
                    task.name && task.date && task.id
                ).map(task => ({
                    ...task,
                    date: new Date(task.date),
                    created: new Date(task.created || Date.now()),
                    completed: task.completed || false,
                    completedAt: task.completedAt ? new Date(task.completedAt) : undefined
                }));

                if (validTasks.length === 0) {
                    throw new Error('沒有有效的任務資料');
                }

                if (confirm(`確定要匯入 ${validTasks.length} 個任務嗎？這將覆蓋現有資料。`)) {
                    this.tasks = validTasks;
                    this.saveTasks();
                    this.renderTasks();
                    this.updateUpcomingEvent();
                    this.updateStatistics();
                    this.showNotification(`📥 成功匯入 ${validTasks.length} 個任務！`, 'success');
                }
            } catch (error) {
                console.error('匯入失敗:', error);
                this.showNotification('匯入失敗：' + error.message, 'danger');
            }
        };

        reader.onerror = () => {
            this.showNotification('檔案讀取失敗', 'danger');
        };

        reader.readAsText(file);

        // 重置檔案輸入
        event.target.value = '';
    }

    // 清除覆蓋層方法（新增）
    clearOverlays() {
        // 隱藏自定義 Modal
        const customModal = document.getElementById('taskModal');
        if (customModal && customModal.style.display === 'block') {
            this.closeModal();
        }

        // 隱藏 Toast 通知
        if (this.toast) {
            this.toast.hide();
        }

        // 清除自定義通知
        const notifications = document.querySelectorAll('.notification');
        notifications.forEach(notification => {
            if (notification.parentNode) {
                notification.remove();
            }
        });

        // 重置任務項目樣式
        const taskItems = document.querySelectorAll('.task-item');
        taskItems.forEach(item => {
            item.style.transform = '';
            item.style.opacity = '';
        });
    }
}

// 全域函數
function openAddModal() {
    if (window.taskManager) {
        taskManager.openAddModal();
    }
}

function closeModal() {
    if (window.taskManager) {
        taskManager.closeModal();
    }
}

function clearAllTasks() {
    if (window.taskManager) {
        taskManager.clearAllTasks();
    }
}

function exportTasks() {
    if (window.taskManager) {
        taskManager.exportTasks();
    }
}

function importTasks(event) {
    if (window.taskManager) {
        taskManager.importTasks(event);
    }
}

// 初始化應用程式
let taskManager;
document.addEventListener('DOMContentLoaded', () => {
    try {
        taskManager = new TaskManager();
        window.taskManager = taskManager; // 全域引用
        console.log('TaskManager 初始化成功');
    } catch (error) {
        console.error('TaskManager 初始化失敗:', error);
    }
});