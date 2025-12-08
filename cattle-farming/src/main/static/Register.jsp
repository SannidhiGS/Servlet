<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cattle Registration</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <script src="js/validation.js"></script>
</head>

<body class="bg-light">

    <div class="container mt-5">
        <div class="card shadow-sm p-4">
            <h2 class="text-center mb-4">Cattle Registration Form</h2>

            <form action="cattle" method="post" onsubmit="return validateForm()">

                <div class="mb-3">
                    <label class="form-label">Owner Name</label>
                    <input type="text" class="form-control" id="owner" name="owner">
                </div>

               <div class="mb-3">
                   <label class="form-label">Cattle Type</label>
                   <select class="form-control" id="type" name="type">
                       <option value="">-- Select Cattle Type --</option>
                       <option value="Cow">Cow</option>
                       <option value="Bull">Bull</option>
                       <option value="Buffalo">Buffalo</option>
                       <option value="Calf">Calf</option>
                       <option value="Ox">Ox</option>
                   </select>
               </div>
                <div class="mb-3">
                    <label class="form-label">Age (Years)</label>
                    <input type="number" class="form-control" id="age" name="age">
                </div>

                <div class="mb-3">
                    <label class="form-label">Weight (Kg)</label>
                    <input type="number" class="form-control" id="weight" name="weight">
                </div>

                <div class="mb-3">
                    <label class="form-label">Location</label>
                    <input type="text" class="form-control" id="location" name="location">
                </div>

                <div class="mb-3">
                    <label class="form-label">Phone</label>
                    <input type="text" class="form-control" id="phone" name="phone">
                </div>
                <button type="submit" class="btn btn-primary w-100">Register</button>
            </form>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
