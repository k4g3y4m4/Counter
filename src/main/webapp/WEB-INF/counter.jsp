<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Welcome Counter</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body class="bg-dark">
<main>
    <div class="container py-5">
        <div class="card text-center">
            <div class="card-header">
                <h5>Welcome to the Counter</h5>
            </div>
            <div class="card-body">
                <p class="card-text">
                    You have visited <a href="/">localhost:8080</a> <c:out value="${countToShow}"></c:out> times.
                </p>
                <p>
                    <a href="/">Test another visit?</a>
                </p>
            </div>
        </div>
    </div>
</main>

</body>
</html>