let timer;
let time = 1 * 60; //秒単位時間設定
let timeLeft = time;
let isRunning = false;

const timerDisplay = document.getElementById("timer");
const startButton = document.getElementById("start");
const stopButton = document.getElementById("stop");
const resetButton = document.getElementById("reset");

// 時間を mm:ss の形式で表示
function updateDisplay(){
	const minutes = Math.floor(timeLeft / 60);
	const seconds = timeLeft % 60;
	timerDisplay.textContent = `${minutes}:${seconds.toString().padStart(2,"0")}`;
}

//タイマー開始
function startTimer(){
	if(!isRunning){
		isRunning = true;
		timer = setInterval(() => {
			if (timeLeft > 0){
				timeLeft--;
				updateDisplay();
			}else{
				clearInterval(timer);
				isRunning = false;
				alert("タイマー終了！");
				timeLeft = time;
				updateDisplay();
			}
		},1000);
	}
}

//タイマー停止
function stopTimer() {
	clearInterval(timer);
	isRunning = false;
}

//タイマーリセット
function resetTimer(){
	clearInterval(timer);
	isRunning = false;
	timeLeft = time;
	updateDisplay();
}

//イベントリスナー表示
startButton.addEventListener("click", startTimer);
stopButton.addEventListener("click", stopTimer);
resetButton.addEventListener("click",resetTimer);

//初期表示
updateDisplay();

