<%-- 
    Document   : LoginSuccess
    Created on : 28 jun 2019, 14:52:54
    Author     : mikel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String email = null;
            Cookie[] cookies = request.getCookies();
            if (cookies != null ) {
                    for(Cookie cookie: cookies){
                        if(cookie.getName().equals("email")){
                            email = cookie.getValue();
                            System.out.println(email);
                        }
                    }
                }
            if (email == null) {
                    response.sendRedirect("index.html");
                }
            %>
            <h1>Hello <%=email%>!</h1>
            <form action = "logout" method="POST">
                <input type="submit" value="Salida">
            </form>
    </body>
</html>
