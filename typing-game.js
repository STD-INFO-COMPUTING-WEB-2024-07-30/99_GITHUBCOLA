
document.addEventListener('DOMContentLoaded', function() {
    const targetText = document.getElementById('target-text').textContent;
    const userInput = document.getElementById('user-input');
    const feedback = document.getElementById('feedback');
    const timer = document.getElementById('timer');

    let startTime;
    let interval;

    userInput.addEventListener('input', function() {
        
        const currentInput = userInput.value;

        // 타이머 시작
        if (!startTime) {
            startTime = new Date().getTime();
            interval = setInterval(updateTimer, 1000);
        }

        // 입력 일치 여부 확인
        if (currentInput === targetText) {
            feedback.textContent = "Great job! You've completed the text.";
            feedback.style.color = "green";
            clearInterval(interval); // 타이머 정지
        } else if (targetText.startsWith(currentInput)) {
            feedback.textContent = "Keep going...";
            feedback.style.color = "orange";
        } else {
            feedback.textContent = "Oops! There's a mistake.";
            feedback.style.color = "red";
        }
    });

    function updateTimer() {
        const currentTime = new Date().getTime();
        const timeElapsed = Math.floor((currentTime - startTime) / 1000);
        timer.textContent = `Time: ${timeElapsed} seconds`;
    }
});
