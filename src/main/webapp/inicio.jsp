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

        <div class="container">
            <div class="row" id="some">
                
            </div>
        </div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.js"></script>
        <script src="js/scriptbar.js"></script>
    </body>
</html>
