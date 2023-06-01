<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
  <head>
    <title>Employee List Page</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
      body {
        padding: 0 10px;
      }
    </style>
  </head>

  <body>
    <h6 class="pt-3 fw-bold">Hi ${name}, welcome to the employee list page! <br><br>Current access level: add, update and delete.</h6>
    <hr>

    <div class="container border border-info border-3 rounded-3 mt-4 p-4">
      <h6 class="fw-bold">This is the list of current employees in the portal:</h6>
        <table class="table mt-3">
          <thead>
            <tr class="table-success">
              <th>ID</th>
              <th>Name</th>
              <th>Address</th>
              <th>Title</th>
              <th>Salary</th>
              <th></th>
              <th></th>
            </tr>
          </thead>
          <tbody>
            <c:forEach var="category" items="${employees}">
              <tr>
                <td>${category.id}</td>
                <td>${category.name}</td>
                <td>${category.address}</td>
                <td>${category.title}</td>
                <td>${category.salary}</td>
                <td><a href="delete-employee?id=${category.id}" class="btn btn-sm btn-warning">Delete</a></td>
                <td><a href="update-employee?id=${category.id}" class="btn btn-sm btn-primary">Update</a></td>
              </tr>
            </c:forEach>
          </tbody>
        </table>

      <a href="add-employee" class="btn btn-success mx-3 mt-2">Add new employee</a>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
  </body>
</html>
