<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title style="font-size: 36px;">JSP - Hello World</title>
    <style>
        body {
            background-color: #222;
            color: #fff;
            font-family: Arial, sans-serif;
        }
        .container {
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        h1 {
            text-align: center;
            margin-top: 0;
        }
        a {
            color: #ff9900;
            align-self: center;
        }
    </style>
</head>
<body>
<div class="container">
    <h1><%= "Dev Web III" %></h1>
    <a href="hello-servlet">Hello Servlet</a>
</div>
</body>
</html>
