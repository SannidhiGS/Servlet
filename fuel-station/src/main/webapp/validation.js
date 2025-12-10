function validateForm() {
    let station = document.getElementById("station");
    let type = document.getElementById("type");
    let quantity = document.getElementById("quantity");
    let price = document.getElementById("price");
    let bar = document.getElementById("bar");

    let isValid = true;
    [ station, type, quantity, price,bar].forEach(field => {
        field.classList.remove("is-invalid");
    });

    if (bar.value.trim() === "") {
        bar.classList.add("is-invalid");
        isValid = false;
    }

    if (station.value.trim() === "") {
        station.classList.add("is-invalid");
        isValid = false;
    }

    if (type.value.trim() === "") {
        type.classList.add("is-invalid");
        isValid = false;
    }

    if (quantity.value.trim() === "" || quantity.value <= 0) {
        quantity.classList.add("is-invalid");
        isValid = false;
    }

    if (price.value.trim() === "" || price.value <= 0) {
        price.classList.add("is-invalid");
        isValid = false;
    }

    if (!isValid) {
        alert("Please fill all required fields correctly!");
        return false;
    }

    return true;
}
