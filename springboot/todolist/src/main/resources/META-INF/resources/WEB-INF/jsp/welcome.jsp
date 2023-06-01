<html>
  <head>
    <title>Welcome Page</title>

    <style>
      .welcomeBox {
        display: flex;
        width: 50%;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        border: 2px solid blue;
        margin-top: 20vh;
        padding-bottom: 25px;
        border-radius: 10px;
      }
    </style>
  </head>
  <body>
    <center>
      <div class="welcomeBox">
          <h3 style="color: green;">Credentials verified.</h3>
          <h2>Hi ${name}, Welcome to Learn Springboot Online Course Page</h2>
          <a href="todolist"><h3>Manage your todolist page</h3></a>
          <h3>Please select your module:</h3>
          <select>
            <option>Learn MVC</option>
            <option>Learn Hibernate</option>
            <option>Learn REST API</option>
          </select>
      </div>
    </center>
  </body>
</html>
