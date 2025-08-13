function showLength() {
    let textValue = document.getElementById("myInput").value;
    let length = textValue.length;
    document.getElementById("result").innerHTML = "Length: " + length;
}
