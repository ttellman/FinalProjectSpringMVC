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
<link rel="stylesheet" href=<c:url value= "/resources/css/main1.css" /> />
</head>
<body>
	<div class="main_wrapper">
		<header id="topheader">
		<span id="headerheading">
		<h1>Welcome to BondStone VideoStore</h1>
		</span>
		<span id="cartspan">
		<c:if test="${not empty sessionScope.username}">
		<p>logged in as: ${sessionScope.username}</p>
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
	

	<div id="cartDiv">

	<h1>Your Shopping Cart</h1>
  <c:forEach items="${cart}" var="film">
    Name: ${film.title}, 
 	Price: <fmt:formatNumber value="$" maxFractionDigits="2" /> $${film.rentalrate}
	
    <br />
  </c:forEach>
 
  <h1>Add Product</h1>
  <form method="post" action="Check out">
    
    <button>Add Product</button>
  </form>

	</div>
</div>


</body>
</html>