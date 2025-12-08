function validateForm() {
    let owner = document.getElementById("owner").value.trim();
    let type = document.getElementById("type").value.trim();
    let age = Number(document.getElementById("age").value);
    let weight = Number(document.getElementById("weight").value);
    let location = document.getElementById("location").value.trim();
    let phone = document.getElementById("phone").value.trim();

    if (owner === "" || type === "" || age === "" || weight === "" || location === "" || phone === "") {
        alert("All fields are required");
        return false;
    }

    if (age <= 0) {
        alert("Age must be greater than 0");
        return false;
    }

    if (weight <= 0) {
        alert("Weight must be greater than 0");
        return false;
    }
    if (phone.length !== 10 || isNaN(phone)) {
        alert("Phone number must be exactly 10 digits");
        return false;
    }
    return true;
}
