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
  <img height="300" width="900" src="https://club-house-hotel-rome.nochi.com.ua/data/Photos/OriginalPhoto/3530/353022/353022490/C-Hotels-Club-House-Roma-Exterior.JPEG" alt="Пам'ятка 1">
  <img height="300" width="900" src="https://cf.bstatic.com/xdata/images/hotel/max1024x768/226679318.jpg?k=3899708a3287c1f6b1213ed80d045abc90ecff47aea2f02d626cff92f0d2c1da&o=&hp=1" alt="Пам'ятка 2">
  <img height="300" width="900" src="https://club-house-hotel-rome.nochi.com.ua/data/Photos/OriginalPhoto/3083/308397/308397677/C-Hotels-Club-House-Roma-Restaurant.JPEG"
       alt="Пам'ятка 2">
  <img height="300" width="900" src="https://www.romehotelstart.com/data/Pictures/OriginalPhoto/9659/965933/965933413/rome-club-house-hotel-picture-29.JPEG" alt="Пам'ятка 2">
</div>


</body>
</html>
