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
        <form:input class="mt-2 w-100" type="text" path="name" required="required"/>

        <label class="mt-3">Address:</label>
        <form:input class="mt-2 w-100" type="text" path="address" required="required"/>
        <p class="text-danger mt-2">
          <form:errors path="address"/>
        </p>

        <label class="mt-2">Title:</label>
        <form:input class="mt-2 w-100" type="text" path="title" required="required"/>
        <p class="text-danger mt-2">
          <form:errors path="address"/>
        </p>

        <label class="mt-2">Salary:</label>
        <form:input class="mt-2 w-100" type="number" path="salary" required="required"/>

        <button type="submit" class="btn btn-md btn-success mt-4">Submit</button>
        <a href="employeelist" class="btn btn-md btn-warning mt-4 mx-2">Return to Employee List</a>
      </form:form>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
  </body>
</html>