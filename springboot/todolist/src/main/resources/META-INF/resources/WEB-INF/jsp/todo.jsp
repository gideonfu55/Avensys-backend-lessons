<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
  <head>
    <title>Add Todo Page</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <style>

    </style>
  </head>

  <body>
    <div class="container border border-info mt-5 p-5">
      <h3>Enter Todo Details</h3>
      <form:form method="post" modelAttribute="todo">
        <br>
        <label>Description:</label>
        <form:input type="text" path="description" required="required"/>

        <form:input type="hidden" path="id"/>

        <br><br>
        <label>Target Date</label>
        <form:input type="date" path="targetDate" required="required"/>

        <form:input type="hidden" path="done"/>

        <br><br>
        <button class="btn btn-success">Submit</button>
      </form:form>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
  </body>
</html>
