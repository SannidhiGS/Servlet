<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hatchery Registration</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-image: url('https://giffiles.alphacoders.com/210/21034.gif'); /* Replace with your image */
            background-size: cover;
            background-repeat: no-repeat;
            background-attachment: fixed;
        }
        .form-container {
            background: rgba(255, 255, 255, 0.95);
            padding: 30px;
            border-radius: 15px;
            max-width: 600px;
            margin: 50px auto;
            box-shadow: 0 8px 16px rgba(0,0,0,0.3);
        }
        h2 {
            text-align: center;
            margin-bottom: 25px;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>Aqua Marine Registration Form</h2>
        <form action="fish" method="post">
            <div class="mb-3">
                <label for="owner" class="form-label">Owner Name:</label>
                <input type="text" class="form-control" name="owner" id="owner" placeholder="Enter owner name">
            </div>

            <div class="mb-3">
                <label for="fish" class="form-label">Fish Type:</label>
                <select class="form-select" name="fishType" id="fish">
                    <option value="">Select</option>
                    <option value="Tilapia">Tilapia</option>
                    <option value="Catfish">Catfish</option>
                    <option value="Shrimp">Shrimp</option>
                    <option value="Carp">Carp</option>
                    <option value="Salmon">Salmon</option>
                    <option value="Trout">Trout</option>
                    <option value="Bass">Bass</option>
                    <option value="Pangasius">Pangasius</option>
                </select>
            </div>

            <div class="mb-3">
                <label for="pond" class="form-label">Pond Size (in Sq.m):</label>
                <input type="number" class="form-control" name="pondSize" id="pond" placeholder="Enter pond size">
            </div>

            <div class="mb-3">
                <label for="qty" class="form-label">Quantity:</label>
                <input type="number" class="form-control" name="quantity" id="qty" placeholder="Enter quantity">
            </div>

            <div class="mb-3">
                <label for="location" class="form-label">Location:</label>
                <input type="text" class="form-control" name="location" id="location" placeholder="Enter location">
            </div>

            <div class="mb-3">
                <label for="phone" class="form-label">Phone:</label>
                <input type="text" class="form-control" name="phone" id="phone" placeholder="Enter 10-digit phone number">
            </div>

            <div class="d-grid">
                <button type="submit" class="btn btn-primary btn-lg">Submit</button>
            </div>
        </form>
    </div>

    <!-- Bootstrap JS Bundle -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

    <!-- Validation JS Snippet -->
    <script>
    document.addEventListener("DOMContentLoaded", function () {
        const form = document.querySelector("form");

        form.addEventListener("submit", function (e) {
            let valid = true;

            // Remove previous error messages
            document.querySelectorAll(".text-danger").forEach(el => el.remove());

            // Get form values
            const owner = document.getElementById("owner").value.trim();
            const fish = document.getElementById("fish").value;
            const pond = parseFloat(document.getElementById("pond").value);
            const qty = parseInt(document.getElementById("qty").value);
            const location = document.getElementById("location").value.trim();
            const phone = document.getElementById("phone").value.trim();

            // Validation
            if(owner.length < 3) {
                showError("owner", "Owner name must be at least 3 characters.");
                valid = false;
            }
            if(fish === "") {
                showError("fish", "Please select a fish type.");
                valid = false;
            }
            if(isNaN(pond) || pond <= 0) {
                showError("pond", "Pond size must be a positive number.");
                valid = false;
            }
            if(isNaN(qty) || qty <= 0) {
                showError("qty", "Quantity must be a positive number.");
                valid = false;
            }
            if(location.length < 3) {
                showError("location", "Location must be at least 3 characters.");
                valid = false;
            }
            if(!/^[0-9]{10}$/.test(phone)) {
                showError("phone", "Enter a valid 10-digit phone number.");
                valid = false;
            }

            if(!valid) e.preventDefault();
        });

        // Function to display error message
        function showError(id, message) {
            const input = document.getElementById(id);
            const error = document.createElement("div");
            error.className = "text-danger small mt-1";
            error.innerText = message;
            input.parentNode.appendChild(error);
        }
    });
    </script>
</body>
</html>

