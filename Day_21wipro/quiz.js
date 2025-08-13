let questions = [
    { q: "what is the capital of India?", options: ["Delhi", "Mumbai", "Kolkata"], ans: "Delhi" },
    { q: "2 + 2 = ?", options: ["3", "4", "5"], ans: "4" },
    { q: "Largest planet?", options: ["Earth", "Jupiter", "Mars"], ans: "Jupiter" }
];

let index = 0, score = 0;

function loadQuestion() {
    let q = questions[index];
    document.getElementById("question").innerText = q.q;
    let optionsDiv = document.getElementById("options");
    optionsDiv.innerHTML = "";

    q.options.forEach(opt => {
        let btn = document.createElement("button");
        btn.innerText = opt;
        btn.onclick = () => {
            if (opt === q.ans) {
                document.getElementById("feedback").innerText = "Correct!";
                score++;
            } else {
                document.getElementById("feedback").innerText = "Wrong!";
            }
            document.getElementById("score").innerText = "Score: " + score;
        };
        optionsDiv.appendChild(btn);
    });
}

function nextQuestion() {
    index++;
    if (index < questions.length) {
        document.getElementById("feedback").innerText = "";
        loadQuestion();
    } else {
        document.getElementById("question").innerText = "Quiz Over!";
        document.getElementById("options").innerHTML = "";
        document.getElementById("feedback").innerText = "Final Score: " + score;
    }
}

loadQuestion();
