// 嘗試自動播放背景音樂
const audio = document.getElementById('bgMusic');

// 當頁面載入完成時嘗試播放
window.addEventListener('load', function () {
    audio.play().catch(function (error) {
        console.log('自動播放被阻止，等待使用者互動');
    });
});

// 當使用者與頁面互動時播放
document.addEventListener('click', function () {
    if (audio.paused) {
        audio.play();
    }
}, { once: true });

// 當使用者滾動頁面時播放
document.addEventListener('scroll', function () {
    if (audio.paused) {
        audio.play();
    }
}, { once: true });
