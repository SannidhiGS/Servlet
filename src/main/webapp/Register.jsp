<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <!-- Bootstrap CSS -->
  <link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
    rel="stylesheet">

  <title>Restaurant Registration</title>
</head>

<body class="bg-light">

  <div class="container mt-5">
    <div class="row justify-content-center">
      <div class="col-md-6">

        <div class="card shadow-sm">
          <div class="card-body">

            <h4 class="text-center mb-4">Restaurant Registration</h4>
            <form action="bid" method="post">

              <div class="mb-3">
                <label class="form-label">Player Name</label>
                <input type="text" class="form-control" name="name">
              </div>
              <div class="mb-3">
                <label class="form-label">Player Age</label>
                <input type="number" class="form-control" name="age">
              </div>

              <select class="form-select" name="playerType" id="playerType" onchange="handlePlayerType()">
                <option selected disabled>Select</option>
                <option value="bat">Batsman</option>
                <option value="ball">Bowler</option>
                <option value="keep">Wicket Keeper</option>
                <option value="all">All Rounder</option>
              </select>

              <div class="mb-3">
                <label class="form-label">State:</label>
                <input type="text" class="form-control" name="state">
              </div>
              <div class="mb-3" id="battingDiv" style="display:none;">
                <label class="form-label">Batting Average:</label>
                <input type="number" class="form-control" name="battingAvg">
              </div>

             <div class="mb-3" id="bowlingDiv" style="display:none;">
               <label class="form-label">Bowling Average:</label>
               <input type="number" class="form-control" name="bowlingAvg">
             </div>

              <div class="mb-3" id="stumpsDiv" style="display:none;">
                <label class="form-label">No of Stumps:</label>
                <input type="number" class="form-control" name="numOfStumps">
              </div>

              </div>
              <div class="d-grid">
                <button type="submit" class="btn btn-primary">
                  Submit
                </button>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
  <script>
    function handlePlayerType() {
      const type = document.getElementById("playerType").value;

      const batting = document.getElementById("battingDiv");
      const bowling = document.getElementById("bowlingDiv");
      const stumps = document.getElementById("stumpsDiv");

      batting.style.display = "none";
      bowling.style.display = "none";
      stumps.style.display = "none";

      if (type === "bat") batting.style.display = "block";
      else if (type === "ball") bowling.style.display = "block";
      else if (type === "keep") stumps.style.display = "block";
      else if (type === "all") {
        batting.style.display = "block";
        bowling.style.display = "block";
        stumps.style.display = "block";
      }
    }
  </script>
</body>
</html>
