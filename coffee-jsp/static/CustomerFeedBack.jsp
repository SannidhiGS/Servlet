<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
  </head>
  <body>
    <h1>Hello, Please Give a Valuable Feedback!</h1>
    <form action="feed" method="post">
                <div>
                  <label for="exampleInputEmail1" class="form-label">Name</label>
                  <input type="text" class="form-control" id="exampleInputEmail1" name="name">
                  <div id="emailHelp" class="form-text">Enter the  Name....</div>
                </div>
                <div class="mb-3">
                  <label for="farmer" class="form-label">Email</label>
                  <input type="email" class="form-control" name="email" id="exampleInputPassword1">
                </div>
                <div class="form-floating">
                  <textarea class="form-control" placeholder="Leave a comment here" id="floatingTextarea" name="comment"></textarea>
                  <label for="floatingTextarea">Comments</label>
                </div>
                <div class="mb-3">
                        <label class="form-label">Rating</label>
                        <select  name="star" class="form-control" required>
                            <option value="select">Select Rating</option>
                            <option value="1">1 Star</option>
                            <option value="2">2 Star</option>
                            <option value="3">3 Star</option>
                            <option value="4">4 Star</option>
                            <option value="5">5 Star</option>
                        </select>
                    </div>
               <button type="submit" class="btn btn-primary" background-color="brown" action="send">Submit</button>
    </form>
  </body>
</html>