<%-- 
    Document   : reservaciones
    Created on : 11 jul 2019, 20:00:39
    Author     : mikel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Reservaciones</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css">
        <link href='datepicker.css' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="styles/reservaciones.css">
    </head>
    <body>
        <table class="table table-hover sortable" cellspacing="0" width="100%">
            <thead>
                <tr>
                    <th scope="col">Usuario</th>
                    <th scope="col"># Personas</th>
                    <th scope="col">Fecha y hora</th>
                    <th scope="col"></th>
                </tr>
            </thead>
            <tbody id = "contenido">
                <% if (application.getAttribute("mensajerecibido") != null) {%>
                <%= application.getAttribute("mensajerecibido")%>
                <% }%>
            </tbody>

        </table>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
                integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>

        <!-- Datepicker -->

        <!--<script src='datepicker.js' type='text/javascript'></script>-->
        <script src="js/tabla.js"></script>
        <script src="js/reservacion.js"></script>
    </body>
</html>
