const modal = document.getElementById('myModal');

function showModal(title, text) {
    document.getElementById('modalTitle').textContent = title;
    document.getElementById('modalText').textContent = text;
    modal.style.display = 'block';
}

function closeModal() {
    modal.style.display = 'none';
}

// 跟隨滑鼠移動
document.addEventListener('mousemove', function (e) {
    if (modal.style.display === 'block') {
        // 設定彈窗位置在滑鼠右下方偏移 15px
        modal.style.left = (e.pageX + 15) + 'px';
        modal.style.top = (e.pageY + 15) + 'px';
    }
});
