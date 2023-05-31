<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
  <head>
    <title>Todo Page</title>

    <style>
      table {
        border-collapse: collapse;
        width: 100%;
      }
      th, td {
        padding: 8px;
        text-align: left;
        border-bottom: 1px solid #ddd;
        height: 30px;
      }
      th {
        background-color: #f2f2f2;
      }
    </style>
  </head>

  <body>
    <h3>Hi ${name}, Welcome to your Todolist Page!</h3>
    <hr>
    <br>
    <h3>Here is your list of todo items: </h3>
    <!-- <div>${todos}</div> -->
    <table>
      <thead>
        <tr>
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
  </body>
</html>
