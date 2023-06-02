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

        <label>Description:</label>
        <form:input class="mx-2" type="text" path="description" required="required"/>
        <span class="text-danger mx-2">
          <form:errors path="description"/>
        </span>

        <br><br>
        <label>Target Date:</label>
        <form:input class="mx-2" type="date" path="targetDate" required="required"/>

        <form:input type="hidden" path="done"/>

        <br><br>
        <button type="submit" class="btn btn-sm btn-success">Submit</button>
      </form:form>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
  </body>
</html>
