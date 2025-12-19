<!doctype html>
<html>
<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css">

  <title>IPL</title>

  <style>
    /* Background image for the whole page */
    body {
      background-image: url('https://images.unsplash.com/photo-1569301020375-8709b37a5d83?auto=format&fit=crop&w=1950&q=80');
      background-size: cover;
      background-position: center;
      background-repeat: no-repeat;
      min-height: 100vh;
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    }

    /* Overlay for better readability */
    .overlay {
      background-color: rgba(0, 0, 0, 0.6);
      min-height: 100vh;
      padding-top: 20px;
    }

    /* Navbar customization */
    .navbar {
      background-color: #ff4d4d !important; /* IPL red theme */
      box-shadow: 0 4px 6px rgba(0,0,0,0.3);
    }

    .navbar-brand, .navbar-nav .nav-link {
      color: #fff !important;
      font-weight: bold;
    }

    .navbar-nav .nav-link:hover {
      color: #ffd700 !important; /* gold color on hover */
      transition: 0.3s;
    }

    /* Footer style */
    footer {
      text-align: center;
      padding: 20px 0;
      color: #fff;
      background-color: rgba(0,0,0,0.7);
      position: absolute;
      width: 100%;
      bottom: 0;
    }
  </style>
</head>
<body>
  <div class="overlay">
    <nav class="navbar navbar-expand-lg">
      <div class="container-fluid">
        <a class="navbar-brand" href="#">IPL</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav ms-auto">
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="Register.jsp">Register</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="login.jsp">Player Search</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>

    <!-- Optional hero section -->
    <div class="text-center text-white mt-5">
      <h1 style="font-size: 3rem; font-weight: bold;">Welcome to IPL Bidding</h1>
      <p style="font-size: 1.5rem;">Register players and start bidding for your favorite teams!</p>
    </div>
  </div>

  <footer>
    &copy; 2025 IPL Bidding. All Rights Reserved.
  </footer>

  <!-- Bootstrap JS -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
