<%-- 
    Document   : inicio
    Created on : 1 jul 2019, 18:03:13
    Author     : mikel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <meta http-equiv="X-UA-Compatible" content="ie=edge" />
        <title>Menús</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous" />
        <link rel="stylesheet" type="text/css" href="styles/bares.css">
        <script src="https://kit.fontawesome.com/24466b86ce.js"></script> <!-- iconos -->
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

        <div id="nav-placeholder"></div>



        <div class="container"> 
            <div class="row">

                <div class="card mb-3 col-sm-4 primerFila">

                    <img src="img/Bienvenido2.jpg" class="imagen" class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title nombreBar">Bienvenido Pariente</h5>
                        <p class="card-text tematica">Botanero</p>
                        <p class="card-text horario">Horario: Lunes a Domingo de 2:00pm a 11:00pm</p>
                        <p class="card-text calificacion">Calificacion: 5 estrellas</p>
                        <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
                    </div>
                </div>


                <div class="card mb-3 col-sm-4 primerFila" >

                    <img src="img/galaxy.jpg" class="imagen" class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title nombreBar">Galaxy 1985</h5>
                        <p class="card-text tematica">Bar Discoteca y Club Nocturno</p>
                        <p class="card-text horario">Horario: Lunes a Domingo de 2:00pm a 11:00pm</p>
                        <p class="card-text calificacion">Calificacion 5 estrellas</p>
                        <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
                    </div>
                </div>



                <div class="card mb-3 col-sm-4 primerFila">

                    <img src="img/rey.jpg" class="imagen" class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title nombreBar">El Rey Mezcaleria</h5>
                        <p class="card-text tematica">Cantina Cerveceria</p>
                        <p class="card-text horario">Horario: Lunes a Domingo de 2:00pm a 11:00pm</p>
                        <p class="card-text calificacion">Calificacion 5 estrellas</p>
                        <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
                    </div>
                </div>
            </div>
        </div>


        <div class="container">   
            <div class="row">

                <div class="card mb-3 col-sm-4 filas" >

                    <img src="img/pinta.jpg" class="imagen" class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title nombreBar">Pinta Negra</h5>
                        <p class="card-text tematica">Restaurante Bar</p>
                        <p class="card-text horario">Horario: Lunes a Domingo de 2:00pm a 11:00pm</p>
                        <p class="card-text calificacion">Calificacion: 5 estrellas</p>
                        <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
                    </div>
                </div>


                <div class="card mb-3 col-sm-4 filas"  >

                    <img src="img/peter.jpg" class="imagen"  class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title nombreBar">Peter Brown</h5>
                        <p class="card-text tematica">Bar de cocteles Cerveceria</p>
                        <p class="card-text horario">Horario: Lunes a Domingo de 2:00pm a 11:00pm</p>
                        <p class="card-text calificacion">Calificacion 5 estrellas</p>
                        <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
                    </div>
                </div>


                <div class="card mb-3 col-sm-4 filas">

                    <img src="img/patan.jpg" class="imagen" class="card-img-top imagenCard" alt="...">
                    <div class="card-body">
                        <h5 class="card-title nombreBar">Patan Ale</h5>
                        <p class="card-text tematica">Cerveceria Restaurante Pub</p>
                        <p class="card-text horario">Horario: Lunes a Domingo de 2:00pm a 11:00pm</p>
                        <p class="card-text calificacion">Calificacion 5 estrellas</p>
                        <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
                    </div>
                </div>
            </div>
        </div>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script type="text/javascript" src="js/algo.js"></script>
    </body>
</html>
