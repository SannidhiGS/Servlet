<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
  </head>
   <body>
      <h1>Welcome to our coffee land!</h1>
      <form action="land" method="post">
        <div>
          <label for="exampleInputEmail1" class="form-label">Size</label>
          <input type="text" class="form-control" id="exampleInputEmail1" name="size">
          <div id="emailHelp" class="form-text">Enter the coffee land size by acre....</div>
        </div>
        <div class="mb-3">
          <label for="farmer" class="form-label">Total Plants</label>
          <input type="number" class="form-control" name="total" id="exampleInputPassword1">
        </div>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Yield</label>
            <input type="text" class="form-control" id="exampleInputEmail1" name="quantity">
             <div id="emailHelp" class="form-text">Enter the coffee yield in quintal....</div>
              </div>
              <div class="mb-3">
                <label for="farmer" class="form-label">Expenditure</label>
                <input type="text" class="form-control" name="expend" id="exampleInputPassword1">
              </div>
              <div class="mb-3">
               <label for="farmer" class="form-label">Profit</label>
                <input type="text" class="form-control" name="profit" id="exampleInputPassword1">
                 </div>
                 <div class="mb-3">
                 <label for="farmer" class="form-label">Fertilizer</label>
                  <input type="text" class="form-control" name="Fert" id="exampleInputPassword1">
                  </div>

        <button type="submit" class="btn btn-primary" background-color="brown" action="send">Submit</button>
      </form>
    </body>
</html>