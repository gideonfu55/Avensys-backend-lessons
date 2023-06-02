<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
  <head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>Todo Page</title>

    <style>
      body {
        padding: 0 10px;
      }
    </style>
  </head>

  <body>
    <h6 class="pt-3 fw-bold">Hi ${name}, welcome to your Todolist Page!</h6>
    <hr>
    <h6 class="fw-bold">Here is your list of todo items:</h6>
      <table class="table border border-dark border-3 mt-3">
        <thead">
          <tr class="table-info">
            <th style="display: none;">ID</th>
            <th width="10%">Username</th>
            <th width="15%">Description</th>
            <th width="5%">Target Date</th>
            <th width="10%" class="text-center">Completion</th>
            <th width="5%"></th>
            <th width="5%"></th>
          </tr>
        </thead>
        <tbody>
          <c:forEach var="category" items="${todos}">
            <tr>
              <td style="display: none;">${category.id}</td>
              <td>${category.username}</td>
              <td>${category.description}</td>
              <td>${category.targetDate}</td>
              <td class="text-center" style="padding-top: 12px;">
                <input type="checkbox" ${category.done ? 'checked' : ''}>
              </td>
              <td><a href="delete-todo?id=${category.id}" class="btn btn-sm btn-warning">Delete</a></td>
              <td><a href="update-todo?id=${category.id}" class="btn btn-sm btn-primary">Update</a></td>
            </tr>
          </c:forEach>
        </tbody>
      </table>

    <a href="add-todo" class="btn btn-success mx-2 mt-2">Add a todo</a>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
  </body>
</html>
