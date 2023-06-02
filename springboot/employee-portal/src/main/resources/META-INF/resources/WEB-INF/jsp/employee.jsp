<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
  <head>
    <title>Add Employee Page</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  </head>

  <body>
    <div class="container border border-info border-3 rounded-3 mt-3 p-3">
      <h3 class="fw-bold mb-0">Enter Employee Details</h3>
      <form:form method="post" modelAttribute="employee">
        <br>
        <form:input type="hidden" path="id"/>

        <label class="fw-bold">Employee Name:</label>
        <form:input class="mt-2 w-100" type="text" path="name" required="required"/>

        <label class="mt-4 fw-bold">Address:</label>
        <form:input class="mt-2 w-100" type="text" path="address" required="required"/>
        <p class="text-danger mt-1 mb-0" style="font-size: 14px;">
          <form:errors path="address"/>
        </p>

        <label class="mt-3 fw-bold">Title:</label>
        <form:input class="mt-2 w-100" type="text" path="title" required="required"/>
        <p class="text-danger mt-1 mb-0" style="font-size: 14px;">
          <form:errors path="title"/>
        </p>

        <label class="mt-3 fw-bold">Salary:</label>
        <form:input class="d-block mt-2 w-20" type="number" path="salary" required="required"/>
        <p class="text-danger mt-1 mb-0" style="font-size: 14px;">
          <form:errors path="salary"/>
        </p>

        <button type="submit" class="btn btn-md btn-success mt-4">Submit</button>
        <a href="employeelist" class="btn btn-md btn-warning mt-4 mx-2">Return to Employee List</a>
      </form:form>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
  </body>
</html>
