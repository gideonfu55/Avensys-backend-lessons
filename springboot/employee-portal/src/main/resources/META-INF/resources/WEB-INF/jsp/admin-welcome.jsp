<html>
  <head>
    <title>Admin Welcome Page</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  </head>
  
  <body>
    <section class="vh-100" style="background-color: #508bfc;">
      <div class="container py-5 h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
          <div class="col-12 col-md-8 col-lg-6 col-xl-6">
            <div class="card shadow-2-strong" style="border-radius: 1rem;">
              <div class="card-body p-5 text-center">
                <h5 style="color:green; display: inline-block" class="mb-2">Credentials verified:</h5>
                <div class="mb-4 mx-2 p-1" style="display: inline-block; width: 75px; border-radius: 5px; background-color: red; color: white;">
                  Admin
                </div>
                <h5 class="mb-4 fw-bold">Hi ${name}, welcome to the Employee Portal!</h5>
                <button class="btn btn-info mt-2"><a href="employeelist" style="text-decoration: none; color: black;">Click to manage the employee list.</a>
              </div></button>
            </div>
          </div>
        </div>
      </div>
    </section>
  </body>
</html>
