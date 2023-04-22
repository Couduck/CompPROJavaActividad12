<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Indice triangulos</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    </head>

    <body>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
        <h1>Hola mundo</h1>
        
        <a href="controlInsert">Calcular un nuevo triangulo</a><br><br>
        
        <table class="table table-light">
        <thead class="thead-light">
            <tr>
                <th>#</th>
                <th>Base</th>
                <th>Altura</th>
                <th>Perimetro</th>
                <th>Area</th>
            </tr>
        </thead>

        <tbody>
            <c:forEach var="triangulo" items="${todosTriangulos}">
            <tr>
                <td>${triangulo.id}</td>
                <td>${triangulo.base}</td>
                <td>${triangulo.altura}</td>
                <td>${triangulo.perimetro}</td>
                <td>${triangulo.area}</td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
        
    </body>
</html>
