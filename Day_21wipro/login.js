function validateEmail() {
    let email = document.getElementById("email").value.trim();
    let emailError = document.getElementById("emailError");
    let regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if (email === "" || !regex.test(email)) {
        emailError.style.visibility = "visible";
        return false;
    } else {
        emailError.style.visibility = "hidden";
        return true;
    }
}

function validatePassword() {
    let pass = document.getElementById("password").value.trim();
    let passError = document.getElementById("passError");

    if (pass === "") {
        passError.style.visibility = "visible";
        return false;
    } else {
        passError.style.visibility = "hidden";
        return true;
    }
}

function handleLogin() {
    let emailValid = validateEmail();
    let passValid = validatePassword();

    if (emailValid && passValid) {
        alert("Login successful!");
    }
}
