<%-- 
    Document   : vistaBar
    Created on : 10 jul 2019, 22:41:38
    Author     : mikel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Bares</title>
        <meta charset="utf-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous" />
        <link rel="stylesheet" type="text/css" href="styles/barchido.css"/>
        <script src="https://kit.fontawesome.com/24466b86ce.js"></script>
    </head>
    <body>
        
        <%
            String email = null;
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("email")) {
                        email = cookie.getValue();
                        System.out.println(email);
                    }
                }
            }
            if (email == null) {
                response.sendRedirect("index.html");
            }
        %>
        
        <nav
        class="navbar navbar-expand-lg navbar-dark bg-dark flex-column flex-md-row bd-navbar navbar fixed-top navbar-light bg-light">
        <a class="navbar-brand" href="inicio.html">LetsParty</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item active">
                    <a class="nav-link" href="inicio.jsp">Inicio <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href=".\logout">Salir</a>
                </li>
            </ul>
        </div>
    </nav>
        
        <div class="container hola">
            <div>
                <img id = "imgLogo" src="" class="encabezado">
                <div>
                    <h1 class="titulo nombreBar" ></h1>
                    <h3 class="titulo">Descripcion:</h3>
                    <h5 class="titulo descripcionBar"></h5>
                </div>
            </div>
        </div>

        <div class="container carrucel">
            <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carouselExampleIndicators" data-slide-to="0"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                    
                </ol>
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img  class="imgCarrucel" src="img/Bienvenido2.jpg" class="d-block w-100" alt="...">
                    </div>
                    <div class="carousel-item">
                        <img class="imgCarrucel" src="img/galaxy.jpg" class="d-block w-100" alt="...">
                    </div>
                    <div class="carousel-item">
                        <img  class="imgCarrucel" src="img/rey.jpg" class="d-block w-100" alt="...">
                    </div>
                </div>
                <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </div>

        <div class="container">
            <div class="row">
                <div class="card-body col-sm-8">
                    <div>
                        <h3 class="card-title  menuTitulo">MENU</h3>
                    </div>
                    <div>
                        <img src="" class="menuImg menu">
                    </div>
                </div>
                <div class="card-body col-sm-4">
                    <h3 class="card-title">RESERVACION</h3>
                    <form action = "regreservacion" method = "post">
                        <div>
                            <h5> Fecha de Reservacion</h5>
                        </div>
                        <div>
                            <div>
                                <i class="far fa-calendar-alt"></i>
                            </div>
                            <input  type="date" name="fecha_reservacion">
                        </div>
                        <div>
                            <h5>Numero de Personas</h5>
                        </div>
                        <div>
                            <i class="fas fa-users"></i>
                        </div>
                        <div>
                            <input type="number"  name="personasNumero" min="1" max="10">
                        </div>
                        <div>
                            <h5>Horario</h5>
                        </div>
                        <div>
                            <i class="fas fa-clock"></i>
                        </div>
                        <div>
                            <input type="time" name="horario">
                        </div>
                        <div>
                            <div>
                                <input type="submit" value="Reservar" name="reservar" class="reservar">
                            </div>
                        </div>
                    </form>
                    
                    <div>
                        <div class="direccion">
                            <h6 class="calle"><i class="fas fa-map-marker-alt"></i>  Pedro Morebre 1155 Guadalajara (México)</h6>
                            <h6 class="telefono"><i class="fas fa-phone-square"></i>  Llamar 01 33 3973 1358</h6>
                            <h6 class="correo"><i class="fas fa-envelope-square"></i>  bienvenidopariente@gmail.com</h6>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="container comentContainer">
            <div>
                <h5>Comentarios: </h5>
            </div>
            <div>
                <input class="comentarios" type="text" name="comentarios">
            </div>
            <div>
                <input type="submit" value="Enviar comentarios" name="enviarComentario" class="butonComentarios">
            </div>
        </div>
        
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.js"></script>
        <script type="text/javascript" src="js/scriptimagen.js"></script>
        
    </body>
</html>
