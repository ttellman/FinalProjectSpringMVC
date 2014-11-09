<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="true"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BondStone Video Store</title>
<link rel="stylesheet" href=<c:url value= "/resources/css/reset.css" /> />
<link rel="stylesheet" href=<c:url value= "/resources/css/bootstrap.css" /> />
<link rel="stylesheet" href=<c:url value= "/resources/css/main1.css" /> />
</head>
<body onload='document.loginForm.username.focus();'>
	<div class="main_wrapper">
		<header id="topheader">
		<span id="headerheading">
		<h1>Welcome to BondStone VideoStore</h1>
		</span>
		<span id="cartspan">
		<c:if test=" ${pageContext.request.userPrincipal.name} == null">
		<p>logged in as: ${pageContext.request.userPrincipal.name}</p>
		</c:if>
		<p><a href="cart"> items in cart: ${fn:length(requestScope.cart)}</a></p> 
		</span>
		<nav id="navbar">
			<ul id="navlist">
				<li class="navlistitems"><a href="index" >Home</a></li>
				<li class="navlistitems"><a href="search" >Search</a></li>
				<li class="navlistitems"><a href="browse" >Browse</a></li>
				<li class="navlistitems"><a href="profile" >Profile</a></li>
				<li class="navlistitems"><a href="cart" >Cart</a></li>					
			</ul>
		</nav>	
		</header>
			
			<div id="login-box">
 
		<h3>Login with Username and Password</h3>
 
		<c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>
 
		<form name='loginForm'
		  action="<c:url value='/j_spring_security_check' />" method='POST'>
 
		<table>
			<tr>
				<td>User:</td>
				<td><input type='text' name='username'></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password' /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
				  value="submit" /></td>
			</tr>
		  </table>
 
		  <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
 
		</form>
	</div>
		
	</div>

</body>
</html>