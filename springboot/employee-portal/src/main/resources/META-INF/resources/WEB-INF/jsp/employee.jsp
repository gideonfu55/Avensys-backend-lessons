<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
  <head>
    <title>Add Employee Page</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  </head>

  <body>
    <div class="container border border-info border-3 rounded-3 mt-5 p-4">
      <h3 class="fw-bold">Enter Employee Details</h3>
      <form:form method="post" modelAttribute="employee">
        <br>
        <form:input type="hidden" path="id"/>

        <label>Employee Name:</label>
        <form:input class="w-100" type="text" path="name" required="required"/>

        <label>Address:</label>
        <form:input class="mx-2 w-100" type="text" path="address" required="required"/>
        <span class="text-danger mx-2">
          <form:errors path="address"/>
        </span>

        <br><br>
        <label>Title:</label>
        <form:input class="mx-2 w-100" type="text" path="title" required="required"/>
        <span class="text-danger mx-2">
          <form:errors path="address"/>
        </span>

        <br><br>
        <label>Salary:</label>
        <form:input class="mx-2 w-100" type="number" path="salary" required="required"/>

        <br><br>
        <button class="btn btn-sm btn-success">Submit</button>
      </form:form>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
  </body>
</html>
