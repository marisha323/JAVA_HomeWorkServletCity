<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 04.09.2023
  Time: 22:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            background-color: #f5f5f5;
        }

        h1 {
            font-size: 24px;
            font-weight: bold;
            color: #333;
            margin-top: 20px;
        }

        p {
            font-size: 16px;
            color: #555;
            line-height: 1.4;
        }

        .history-images {
            margin-top: 20px;
        }

        .history-images img {
            max-width: 100%;
            height: auto;
            margin: 10px;
            border: 1px solid #ddd;
            box-shadow: 0 0 5px rgba(0, 0, 0, 0.3);
        }

    </style>
</head>
<body>
<jsp:include page="../nav.jsp" />
<h1>${city.cityName}</h1>
<p>${city.description}</p>


<div class="history-images">
  <img width="500" height="400" src="https://zakavto.com.ua/images/data/Colosseum-Rome.jpg" alt="Рим - фото 1"><br>
  <img width="1400" height="200" src="https://mandry.club/wp-content/uploads/2019/02/rim-1.jpg" alt="Рим - фото 2">
</div>

</body>
</html>
