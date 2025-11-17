<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
  </head>
  <body>
    <h1>Hello Welcome to Our Cafeteria!</h1>
    <form action="cafe" method="post">
            <div>
              <label for="exampleInputEmail1" class="form-label">Name</label>
              <input type="text" class="form-control" id="exampleInputEmail1" name="name">
              <div id="emailHelp" class="form-text">Enter the Cafeteria Name....</div>
            </div>
            <div class="mb-3">
              <label for="farmer" class="form-label">Location</label>
              <input type="text" class="form-control" name="location" id="exampleInputPassword1">
            </div>
            <div class="mb-3">
                  Enter the coffee type:
                  <div class="form-check">
                    <input class="form-check-input" type="radio" name="type" value="Cappuchino" id="radioDefault1">
                    <label class="form-check-label" for="radioDefault1">
                    Cappuchino
                    </label>
                  </div>
                  <div class="form-check">
                    <input class="form-check-input" type="radio" name="type" value="irish" id="radioDefault2" checked>
                    <label class="form-check-label" for="radioDefault2">
                      Irish Coffee
                    </label>
                  </div>
            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">price</label>
                <input type="text" class="form-control" id="exampleInputEmail1" name="price">
                 <div id="emailHelp" class="form-text">Enter the coffee price in rs....</div>
                  </div>
                  <div class="mb-3">
                    <label for="farmer" class="form-label">Franchise Name</label>
                    <input type="text" class="form-control" name="franch" id="exampleInputPassword1">
                  </div>
                  <div class="mb-3">
                   <label for="farmer" class="form-label">Owner Name</label>
                    <input type="text" class="form-control" name="owner" id="exampleInputPassword1">
                     </div>
                     <div class="mb-3">
                     <label for="farmer" class="form-label">GST</label>
                      <input type="text" class="form-control" name="gst" id="exampleInputPassword1">
                      </div>

            <button type="submit" class="btn btn-primary" background-color="brown" action="send">Submit</button>
          </form>
  </body>
</html>