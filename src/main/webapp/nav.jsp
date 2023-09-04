<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 04.09.2023
  Time: 22:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <title>Інформація про місто</title>
    <style>
        nav {
            background-color: #333;
            color: #fff;
            text-align: center;
        }

        nav ul {
            list-style: none;
            padding: 0;
        }

        nav ul li {
            display: inline;
            margin-right: 10px;
        }

        nav ul li a {
            text-decoration: none;
            color: #fff;
        }

        nav ul li a:hover {
            text-decoration: underline;
        }
    </style>

</head>
<body>
<nav>
    <ul>
        <li><a href="hello-servlet">Загальна інформація</a></li>
        <li><a href="history-servlet">Історія міста</a></li>
        <li><a href="landmarks-servlet">Визначні пам'ятки</a></li>
        <li><a href="hotel-servlet">Готелі</a></li>
        <li><a href="restoran-servlet">Ресторани</a></li>
    </ul>
</nav>
</body>
</html>
