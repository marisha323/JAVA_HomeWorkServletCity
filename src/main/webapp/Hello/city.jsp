<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 04.09.2023
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        /* CSS для стилізації сторінки */
        body {
            font-family: Arial, sans-serif;
            text-align: center;
        }

        .city-info {
            border: 1px solid #ccc;
            padding: 20px;
            max-width: 400px;
            margin: 0 auto;
            background-color: #f5f5f5;
        }

        .city-name {
            font-size: 24px;
            font-weight: bold;
        }

        .country-name {
            font-size: 18px;
        }

        .city-coat-of-arms {
            max-width: 100%;
            height: auto;
        }

        .population {
            margin-top: 10px;
            font-size: 16px;
        }

        .description {
            margin-top: 10px;
            font-size: 16px;
        }
    </style>
</head>
<body>
<jsp:include page="/nav.jsp" />
<div class="city-info">
    <h1 class="city-name">${city.cityName}</h1>
    <p class="country-name">${city.countryName}</p>
    <img class="city-coat-of-arms" src="${city.coatOfArmsUrl}" alt="Герб міста" width="200">
    <p class="population">Кількість мешканців: ${city.population}</p>
    <p class="description">${city.description}</p>
</div>
</body>
</html>
