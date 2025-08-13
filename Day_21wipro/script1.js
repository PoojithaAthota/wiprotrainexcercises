input = document.getElementById("input1");
remaining = document.getElementById("remaining");

document.getElementById("btn1").onclick = function() {
    console.log(input.value);
};

input.oninput = function() {
    remaining.textContent = (50 - input.value.length) + " characters remaining";
};
