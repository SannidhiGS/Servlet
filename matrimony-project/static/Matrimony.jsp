<!DOCTYPE html>
<html>
<head>
    <title>Matrimony Form</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
    rel="stylesheet">

<script>
function validateForm() {
    let email = document.getElementById("email").value;
    let gender = document.querySelector("input[name='gender']:checked");
    let dob = document.getElementById("dob").value;
    let mt = document.getElementById("motherTongue").value;
    let religion = document.getElementById("religion").value;
    let ms = document.getElementById("status").value;
    let height = document.getElementById("height").value;

    let emailValid = /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email);
    let heightValid = height >= 1 && height <= 7;

    if (emailValid && gender && dob && mt && religion && ms && heightValid) {
        document.getElementById("submitBtn").disabled = false;
    } else {
        document.getElementById("submitBtn").disabled = true;
    }
}

function updateForLabel() {
    let gender = document.querySelector("input[name='gender']:checked");
    let label = document.getElementById("forLabel");

    if (gender) {
        label.innerText = gender.value === 'Male' ? "Bride's" : "Groom's";
    }
    validateForm();
}
</script>

</head>
<body class="bg-light">

<div class="container mt-5 p-4 shadow rounded bg-white" style="max-width: 600px;">
    <h2 class="text-center mb-4">Matrimony Registration</h2>

    <form action="matrimony" method="post">

        <div class="mb-3">
            <label class="form-label">Email *</label>
            <input type="text" id="email" name="email" class="form-control" onkeyup="validateForm()">
        </div>

        <div class="mb-3">
            <label class="form-label" id="forLabel">For *</label>
            <select id="forType" name="forType" class="form-select" onchange="validateForm()">
                <option value="">Select</option>
                <option value="Self">Self</option>
                <option value="Son">Son</option>
                <option value="Daughter">Daughter</option>
            </select>
        </div>

        <label class="form-label">Gender *</label>
        <div class="mb-3">
            <input type="radio" name="gender" value="Male" onclick="updateForLabel()"> Male
            <input type="radio" name="gender" value="Female" class="ms-3" onclick="updateForLabel()"> Female
        </div>

        <div class="mb-3">
            <label class="form-label">Date of Birth *</label>
            <input type="date" id="dob" name="dob" class="form-control" onchange="validateForm()">
        </div>

        <div class="mb-3">
            <label class="form-label">Mother Tongue *</label>
            <select id="motherTongue" name="motherTongue" class="form-select" onchange="validateForm()">
                <option value="">Select</option>
                <option>Kannada</option>
                <option>Tulu</option>
                <option>Hindi</option>
                <option>Telugu</option>
                <option>Tamil</option>
            </select>
        </div>

        <div class="mb-3">
            <label class="form-label">Religion *</label>
            <select id="religion" name="religion" class="form-select" onchange="validateForm()">
                <option value="">Select</option>
                <option>Hindu</option>
                <option>Muslim</option>
                <option>Christian</option>
                <option>Jain</option>
                <option>Sikh</option>
            </select>
        </div>

        <div class="mb-3">
            <label class="form-label">Marital Status *</label>
            <select id="status" name="status" class="form-select" onchange="validateForm()">
                <option value="">Select</option>
                <option>Single</option>
                <option>Married</option>
                <option>Divorced</option>
            </select>
        </div>

        <div class="mb-3">
            <label class="form-label">Height (1 - 7 ft) *</label>
            <input type="number" id="height" name="height" class="form-control" min="1" max="7" onkeyup="validateForm()">
        </div>

        <button type="submit" id="submitBtn" class="btn btn-primary w-100" disabled>Submit</button>
    </form>
</div>

</body>
</html>
