<!DOCTYPE html>
<html>
<head>
    <title>Matrimony Form</title>
    <meta charset="UTF-8">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
          rel="stylesheet">

    <style>
        body {
            background-image: url('img_1.png'); /* Adjust path */
            background-repeat: no-repeat;
            background-size: cover;
        }
    </style>
</head>

<body class="bg-light">
<div class="container mt-5 p-4 shadow rounded bg-white" style="max-width: 600px;">
    <h2 class="text-center mb-4">Matrimony Registration</h2>

    <form id="matrimonyForm" action="matrimony" method="post" novalidate>

        <div class="mb-3">
            <label class="form-label">Email *</label>
            <input type="text" id="email" name="email" class="form-control">
        </div>

        <div class="mb-3">
            <label class="form-label" id="forLabel">For *</label>
            <select id="forType" name="forType" class="form-select">
                <option value="">Select</option>
                <option value="Self">Self</option>
                <option value="Son">Son</option>
                <option value="Daughter">Daughter</option>
            </select>
        </div>

        <label class="form-label">Gender *</label>
        <div class="mb-3">
            <input type="radio" id="genderMale" name="gender" value="Male">
            <label for="genderMale">Male</label>

            <input type="radio" id="genderFemale" name="gender" value="Female" class="ms-3">
            <label for="genderFemale">Female</label>
        </div>

        <div class="mb-3">
            <label class="form-label">Date of Birth *</label>
            <input type="date" id="dob" name="dob" class="form-control">
        </div>

        <div class="mb-3">
            <label class="form-label">Mother Tongue *</label>
            <select id="motherTongue" name="motherTongue" class="form-select">
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
            <select id="religion" name="religion" class="form-select">
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
            <select id="status" name="status" class="form-select">
                <option value="">Select</option>
                <option>Single</option>
                <option>Married</option>
                <option>Divorced</option>
            </select>
        </div>

        <div class="mb-3">
            <label class="form-label">Height (1 - 7 ft) *</label>
            <input type="number" id="height" name="height" class="form-control" min="1" max="7">
        </div>

        <button type="submit" id="submitBtn" class="btn btn-primary w-100" disabled>
            Submit
        </button>

    </form>
</div>

<!-- Link external JS file -->
<script src="script.js"></script>
</body>
</html>
