<html>
  <head>
    <title>Login Page</title>

    <style>
      .loginBox {
        display: flex;
        width: 50%;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        border: 2px solid blue;
        margin-left: 25%;
        margin-top: 25vh;
        padding-bottom: 15px;
        border-radius: 10px;
      }
    </style>
  </head>
  <body>
    <!-- <div class="container d-flex justify-content-center align-items-center"> -->
      <div class="loginBox">
        <h3 style="margin-bottom: 0; color: red;" name="errorMessage">${errorMessage}</h3>
        <h1>Hi User, welcome to the login page!</h1>
        <h3 style="margin-top: 0;">Please enter your user login details.</h3>
        <form method="post" style="margin-top: 10px;">
          <label for="name">Username:</label>
          <input type="text" name="name" placeholder="Username">
          <br><br>
          <label for="password">Password:</label>
          <input type="password" name="password"  placeholder="Password">
          <br><br>
          <center>
            <button type="submit" style="width: 75px; margin-top: 5px;">Login</button>
          </center>
        </form>
      </div>
    <!-- </div> -->
  </body>
</html>
