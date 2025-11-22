<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
  </head>
  <body>
    <h1>Welcome to our coffee world!</h1>
    <form action="coffee" method="post">
      <div class="mb-3">
      Enter the coffee type:
      <div class="form-check">
        <input class="form-check-input" type="radio" name="type" value="arabica" id="radioDefault1">
        <label class="form-check-label" for="radioDefault1">
          Arabica
        </label>
      </div>
      <div class="form-check">
        <input class="form-check-input" type="radio" name="type" value="robusta" id="radioDefault2" checked>
        <label class="form-check-label" for="radioDefault2">
          Robusta
        </label>
      </div>
        <label for="exampleInputEmail1" class="form-label">Price</label>
        <input type="text" class="form-control" id="exampleInputEmail1" name="price">
        <div id="emailHelp" class="form-text">Enter the coffee price per kg....</div>
      </div>
      <div class="mb-3">
        <label for="farmer" class="form-label">Farmer</label>
        <input type="text" class="form-control" name="farmer" id="exampleInputPassword1">
      </div>
      <div class="mb-3">
          <label for="exampleInputEmail1" class="form-label">Quantity</label>
          <input type="text" class="form-control" id="exampleInputEmail1" name="quantity">
           <div id="emailHelp" class="form-text">Enter the coffee quantity in kg....</div>
            </div>
            <div class="mb-3">
              <label for="farmer" class="form-label">Location</label>
              <input type="text" class="form-control" name="location" id="exampleInputPassword1">
            </div>
      <button type="submit" class="btn btn-primary" background-color="brown" action="send">Submit</button>
    </form>
  </body>
</html>