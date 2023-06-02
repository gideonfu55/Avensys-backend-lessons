<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

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

    <div class="section section-content-p30">
      <div class="container-fluid">
      <h6 class="fw-bold">List of employees in the portal:</h6>
        <table class="table border border-dark border-3 mt-3">
          <thead>
            <tr class="table-success">
              <th width="5%">ID</th>
              <th width="15%">Name</th>
              <th width="20%">Address</th>
              <th width="20%">Title</th>
              <th width="15%">Salary</th>
              <th width="5%"></th>
              <th width="5%"></th>
            </tr>
          </thead>
          <tbody>
            <c:forEach var="category" items="${employees}">
              <tr>
                <td style="width: 5px;">${category.id}</td>
                <td>${category.name}</td>
                <td>${category.address}</td>
                <td>${category.title}</td>
                <td><fmt:formatNumber value="${category.salary}" type="currency" currencyCode="SGD"/></td>
                <td><a href="delete-employee?id=${category.id}" class="btn btn-sm btn-warning">Delete</a></td>
                <td><a href="update-employee?id=${category.id}" class="btn btn-sm btn-primary">Update</a></td>
              </tr>
            </c:forEach>
          </tbody>
        </table>

      <a href="add-employee" class="btn btn-success mx-2 mt-2">Add new employee</a>
      </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
  </body>
</html>
