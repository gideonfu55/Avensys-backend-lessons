<html>
  <head>
    <title>Login Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
  </head>

  <body>
    <section class="vh-100" style="background-color: #508bfc;">
      <div class="container py-5 h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
          <div class="col-12 col-md-8 col-lg-6 col-xl-5">
            <div class="card shadow-2-strong" style="border-radius: 1rem;">
              <div class="card-body px-5 py-4 text-center">
                <!-- Tabs for Admin and Employee -->
                <ul class="nav nav-pills nav-fill">
                  <li class="nav-item">
                    <a class="nav-link active" data-bs-toggle="tab" href="#tab1">Administrator</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link" data-bs-toggle="tab" href="#tab2">Employee</a>
                  </li>
                </ul>
                <!-- End: Tabs for Admin and Employee -->
                <!-- Tab Content -->
                <div class="tab-content mt-4">
                  <!-- Admin Tab Content -->
                  <div class="tab-pane fade show active" id="tab1">
                    <h3 class="mb-4 fw-bold">Admin Sign in</h3>
                    <p class="mb-3" style="margin-bottom: 0; color: red;" name="errorMessage">${errorMessage}</p>
                    <form method="post" action="/login?tab=admin">
                      <div class="form-outline mb-4">
                        <input type="text" name="name" class="form-control form-control-md" placeholder="Username"/>
                      </div>

                      <div class="form-outline mb-4">
                        <input type="password" name="password" class="form-control form-control-md" placeholder="Password"/>
                      </div>

                      <button class="btn btn-primary w-100" type="submit">Login</button>
                    </form>
                  </div>
                  <!-- End: Admin Tab Content -->
                  <!-- Employee Tab Content -->
                  <div class="tab-pane fade" id="tab2">
                    <h3 class="mb-4 fw-bold">Employee Sign in</h3>
                    <p class="mb-3" style="margin-bottom: 0; color: red;" name="errorMessage">${errorMessage}</p>
                    <form method="post" action="/login?tab=employee">
                      <div class="form-outline mb-4">
                        <input type="text" name="name" class="form-control form-control-md" placeholder="Username"/>
                      </div>

                      <div class="form-outline mb-4">
                        <input type="password" name="password" class="form-control form-control-md" placeholder="Password"/>
                      </div>

                      <button class="btn btn-primary w-100" type="submit">Login</button>
                    </form>
                  </div>
                  <!-- End: Employee Tab Content -->
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
  </body>
</html>

