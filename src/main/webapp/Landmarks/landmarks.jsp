<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 04.09.2023
  Time: 23:32
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
            margin: 0;
            padding: 0;
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

        .landmark-images {
            margin-top: 20px;
        }

        .landmark-images img {
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

<div class="landmark-images">
    <img height="300" width="900" src="https://smapse.ru/storage/2021/10/converted/895_0_7-faktov-o-vatikane-samom-malenkom-gosudarstve-mira5-smapse-banner.png" alt="Пам'ятка 1">
    <img height="300" width="900" src="https://all.accor.com/magazine/imagerie/1-5eae.jpg" alt="Пам'ятка 2">
    <img height="300" width="900" src="https://ic.pics.livejournal.com/yelkz/20382074/1812540/1812540_original.jpg"
         alt="Пам'ятка 2">
    <img height="300" width="900" src="https://www.ankasam.org/wp-content/uploads/2023/01/Untitled-design-2023-01-05T102523.876-1920x1080.png" alt="Пам'ятка 2">
</div>
</body>
</html>
