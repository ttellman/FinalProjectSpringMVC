<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="true"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap.min.css"> <!-- load bootstrap css -->
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css"> <!-- load fontawesome -->
</head>
<body>
	<div class="container">

<div class="col-sm-6 col-sm-offset-3">

    <h1><span class="fa fa-sign-in"></span> Login</h1>

    <!-- show any messages that come back with authentication -->
   <%--  <% if (message.length > 0) { %>
        <div class="alert alert-danger"><%= message %></div>
    <% } %> --%>

    <!-- LOGIN FORM -->
    <form name='loginForm'
		  action="<c:url value='/j_spring_security_check' />" method='POST'>
        <div class="form-group">
        
        <c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>
		
            <label>Username</label>
            <input type="text" class="form-control" name="username">
        </div>
        <div class="form-group">
            <label>Password</label>
            <input type="password" class="form-control" name="password">
        </div>

        <button type="submit" class="btn btn-warning btn-lg">Login</button>
    </form>

    <hr>

    <p>Need an account? <a href="/signup">Signup</a></p>
    <p>Or go <a href="/">home</a>.</p>

</div>


</body>
</html>