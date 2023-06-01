<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
  <head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>Todo Page</title>

    <style>

      /* table {
        border-collapse: collapse;
        width: 90%;
      } */

      /*
      th, td {
        padding: 8px;
        text-align: left;
        border-bottom: 1px solid #ddd;
        height: 30px;
      }

      th {
        background-color: #f2f2f2;
      } */
    </style>
  </head>

  <body>
    <h6 class="pt-3">Hi ${name}, welcome to your Todolist Page!</h6>
    <hr>
    <h6 style="font-weight: bold;">Here is your list of todo items:</h6>
      <table class="table mt-3">
        <thead>
          <tr class="table-success">
            <th>ID</th>
            <th>Username</th>
            <th>Description</th>
            <th>Target Date</th>
            <th>Completion</th>
          </tr>
        </thead>
        <tbody>
          <c:forEach var="category" items="${todos}">
            <tr>
              <td>${category.id}</td>
              <td>${category.username}</td>
              <td>${category.description}</td>
              <td>${category.targetDate}</td>
              <td>${category.done}</td>
            </tr>
          </c:forEach>
        </tbody>
      </table>

    <a href="add-todo" class="btn btn-success m-3">Add a todo</a>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
  </body>
</html>
