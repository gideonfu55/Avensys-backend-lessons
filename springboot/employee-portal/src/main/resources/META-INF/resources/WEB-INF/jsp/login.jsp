<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<p%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
  <head>
    <title>Login Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>

    </style>
  </head>

  <body>
    <section class="vh-100" style="background-color: #508bfc;">
      <div class="container py-5 h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
          <div class="col-12 col-md-8 col-lg-6 col-xl-5">
            <div class="card shadow-2-strong" style="border-radius: 1rem;">
              <div class="card-body p-5 text-center">

                <h3 class="mb-4 fw-bold">E-Portal Sign in</h3>
                <p class="mb-3" style="margin-bottom: 0; color: red;" name="errorMessage">${errorMessage}</p>
                <form method="post">
                  <div class="form-outline mb-4">
                    <input type="text" name="name" class="form-control form-control-md" placeholder="Username"/>
                  </div>

                  <div class="form-outline mb-4">
                    <input type="password" name="password" class="form-control form-control-md" placeholder="Password"/>
                  </div>

                  <button class="btn btn-primary w-100" type="submit">Login</button>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
  </body>
</html>
