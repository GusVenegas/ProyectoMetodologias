<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Selección de menú</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="#"><i class="fas fa-utensils"></i> Selección de menú</a>
       
        <form class="form-inline ml-auto" action="search.jsp" method="get">
            <input class="form-control mr-sm-2" type="text" placeholder="Search" name="searchQuery">
            <button class="btn btn-primary" type="submit">Search</button>
        </form>
    </nav>

    <div class="container">
        <div class="row justify-content-center mt-4">
            <div class="col-md-6">
                <form method="POST" action="restauranteControlador?ruta=RegistrarPedido">
                    <div class="form-group">
                        <div class="custom-control custom-radio">
                            <input type="radio" id="hamburguesaSimple" name="plato" value="Hamburguesa simple" class="custom-control-input">
                            <label class="custom-control-label" for="hamburguesaSimple"><i class="fas fa-hamburger"></i> Hamburguesa simple</label>
                        </div>
                        <div class="custom-control custom-radio">
                            <input type="radio" id="hamburguesaDoble" name="plato" value="Hamburguesa doble" class="custom-control-input">
                            <label class="custom-control-label" for="hamburguesaDoble"><i class="fas fa-hamburger"></i> Hamburguesa doble</label>
                        </div>
                        <div class="custom-control custom-radio">
                            <input type="radio" id="hamburguesaConPapas" name="plato" value="Hamburguesa con papas" class="custom-control-input">
                            <label class="custom-control-label" for="hamburguesaConPapas"><i class="fas fa-hamburger"></i> Hamburguesa con papas</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="cantidad"><i class="fas fa-sort-numeric-up"></i> Cantidad:</label>
                        <input type="text" class="form-control" id="cantidad" name="cantidad">
                    </div>
                    <button type="submit" class="btn btn-primary"><i class="fas fa-paper-plane"></i> Enviar pedido</button>
                </form>
            </div>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="https://kit.fontawesome.com/your-font-awesome-kit.js" crossorigin="anonymous"></script>
</body>
</html>