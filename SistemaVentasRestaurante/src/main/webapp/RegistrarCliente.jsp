<!DOCTYPE html>
<html>
<head> <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registrar Cliente</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
  <style>
        .navbar-custom {
            background-color: #343a40;
            color: #ffffff;
        }
        .navbar-custom .navbar-brand {
            color: #ffffff;
        }
        .navbar-custom .nav-link {
            color: #ffffff;
        }
    </style>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark navbar-custom">
        <a class="navbar-brand" href="#"><i class="fas fa-utensils"></i> Mi Restaurante</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
            aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="#"><i class="fas fa-home"></i> Inicio</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#"><i class="fas fa-utensils"></i> Men�</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#"><i class="fas fa-calendar-alt"></i> Reservas</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#"><i class="fas fa-envelope"></i> Contacto</a>
                </li>
            </ul>
        </div>
    </nav>

    <div class="container">
       
        <form method="POST" action="Sv_Cliente?ruta=registrar">
            <fieldset class="w-40">
                <div class="form-group">
                    <label for="nombre"><i class="material-icons">person</i> Nombre:</label>
                    <input type="text" class="form-control" id="nombre" name="nombre">
                </div>
                <div class="form-group">
                    <label for="apellido"><i class="material-icons">person</i> Apellido:</label>
                    <input type="text" class="form-control" id="apellido" name="apellido">
                </div>
                <div class="form-group">
                    <label for="direccion"><i class="material-icons">location_on</i> Direcci�n:</label>
                    <input type="text" class="form-control" id="direccion" name="direccion">
                </div>
                <div class="form-group">
                    <label for="cedula"><i class="material-icons">credit_card</i> C�dula:</label>
                    <input type="text" class="form-control" id="cedula" name="cedula">
                </div>
                <div class="form-group">
                    <label for="correo"><i class="material-icons">email</i> Correo electr�nico:</label>
                    <input type="text" class="form-control" id="correo" name="correo">
                </div>
                <div class="form-group">
                    <label for="telefono"><i class="material-icons">phone</i> Tel�fono:</label>
                    <input type="text" class="form-control" id="telefono" name="telefono">
                </div>
                <button type="submit" class="btn btn-primary"><i class="fas fa-user-plus"></i> Registrar Cliente</button>
            </fieldset>   

    </form>
    <form action="Sv_Cliente" method="GET">       
        <input type="submit" value="ver lista de ususarios">
    </form>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script src="https://kit.fontawesome.com/your-font-awesome-kit.js" crossorigin="anonymous"></script>
</body>
</html>