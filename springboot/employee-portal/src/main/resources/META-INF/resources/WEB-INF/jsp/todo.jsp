<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
  <head>
    <title>Add Todo Page</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  </head>

  <body>
    <div class="container border border-info border-3 rounded-3 mt-5 p-4">
      <h3 class="fw-bold">Enter Todo Details</h3>
      <form:form method="post" modelAttribute="todo">
        <br>
        <form:input type="hidden" path="id"/>
        <form:input type="hidden" path="username"/>

        <label class="fw-bold">Description:</label>
        <form:input class="mt-2 w-100" type="text" path="description" required="required"/>
        <p class="text-danger mt-1 mb-0" style="font-size: 15px;">
          <form:errors path="description"/>
        </p>

        <br>
        <label class="d-block fw-bold">Target Date:</label>
        <form:input class="mt-2" type="date" path="targetDate" required="required"/>
        <p class="text-danger mt-1 mb-0" style="font-size: 15px;">
          <form:errors path="targetDate"/>
        </p>

        <form:input type="hidden" path="done"/>

        <br>
        <button type="submit" class="btn btn-md btn-success mt-3">Submit</button>
        <a href="todolist" class="btn btn-md btn-warning mt-3 mx-2">Return to Todolist</a>
      </form:form>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
  </body>
</html>
