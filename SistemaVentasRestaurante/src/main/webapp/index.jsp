<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="ISO-8859-1">
<!--<meta http-equiv="refresh" content = "0; url=restauranteControlador?ruta=default"/>-->
    <title>Navbar, Slider Bar y Catálogo Deslizable</title>
    <!-- Material-UI -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap" />
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@mui/material@5.0.0-alpha.39/dist/mui.min.css" />

    <!-- Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" />
</head>
<style>
    .carousel-container {
        width: 80%;
        height: 40%;
        margin: auto;
        overflow: hidden;
        position: relative;
    }

    .carousel {
        width: 100%;
        height: 500px;
    }

    .carousel-inner img {
        object-fit: fill;
        width: 100%;
        height: 100%;
    }

    .carousel-control-prev,
    .carousel-control-next {
        width: 10%;
        background-color: rgba(255, 255, 255, 0.5);
        top: 50%;
        transform: translateY(-50%);
        opacity: 0.5;
    }

    .carousel-control-prev:hover,
    .carousel-control-next:hover {
        opacity: 1;
    }

    .carousel-control-prev-icon,
    .carousel-control-next-icon {
        background-color: rgba(0, 0, 0, 0.5);
    }

    .carousel-control-prev-icon:before,
    .carousel-control-next-icon:before {
        content: '';
        position: absolute;
        top: 50%;
        left: 50%;
        transform: translate(-50%, -50%);
        width: 30px;
        height: 30px;
        border-radius: 50%;
        background-color: white;
    }

    /* Estilos para hacer el carrusel responsive */
    @media (max-width: 768px) {
        .carousel-container {
            width: 90%;
            height: 30%;
        }

        .carousel-control-prev,
        .carousel-control-next {
            width: 15%;
        }
    }
</style>
<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">El Goloso  </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
            aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item active">
                    <a class="nav-link" href="RegistrarCliente.jsp">Registrar Cliente </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">About</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Products</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="">Contact</a>
                </li>
            </ul>
        </div>
    </nav>

    <div class="carousel-container">
        <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img class="d-block w-100" src="https://www.howlanders.com/blog/wp-content/uploads/2021/11/latam-exotic-food.jpg" alt="First slide">
                </div>
                <div class="carousel-item">
                    <img class="d-block w-100" src="https://www.cocinasinreceta.com/wp-content/uploads/2021/02/cocina_china_regiones-1200x900.jpg" alt="Second slide">
                </div>
                <div class="carousel-item">
                    <img class="d-block w-100" src="https://i.pinimg.com/736x/a1/9a/1c/a19a1c550b092e02bbc5948e3cbb641c--cabo.jpg" alt="Third slide">
                </div>
            </div>

            <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>
    </div>







    <div class="container mt-4">
        <h2>Products Catalog</h2>
        <div class="row">
            <div class="col-md-4">
                <div class="card mb-4">
                    <img class="card-img-top" src="https://via.placeholder.com/300x200" alt="Product 1">
                    <div class="card-body">
                        <h5 class="card-title">Product 1</h5>
                        <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                        <a href="#" class="btn btn-primary">Buy w</a>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card mb-4">
                    <img class="card-img-top" src="https://via.placeholder.com/300x200" alt="Product 2">
                    <div class="card-body">
                        <h5 class="card-title">Product 2</h5>
                        <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                        <a href="#" class="btn btn-primary">y Now</a>
                    </div>
                </div>
            </div>
			
        </div>
    </div>

    <!-- Bootstrap -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script>
        $(document).ready(function() {
            $('.carousel').on('slide.bs.carousel', function(e) {
                var $currentSlide = $(e.relatedTarget);
                var $prevSlide = $currentSlide.prev();
                var $nextSlide = $currentSlide.next();

                $prevSlide.addClass('prev-slide');
                $nextSlide.addClass('next-slide');
            });

            $('.carousel').on('slid.bs.carousel', function(e) {
                var $prevSlide = $(e.relatedTarget).prev();
                var $nextSlide = $(e.relatedTarget).next();

                $prevSlide.removeClass('prev-slide');
                $nextSlide.removeClass('next-slide');
            });
        });
    </script>
</body>

</html>
