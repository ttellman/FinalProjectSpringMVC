<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="true"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec"	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="datatables" uri="http://github.com/dandelion/datatables"%>
	<sec:authorize access="hasRole('ROLE_USER')">
<!doctype html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BondStone Video Store</title>
<link rel="stylesheet" href=<c:url value= "/resources/css/reset.css" /> />

<!-- DataTables CSS -->
<link rel="stylesheet" type="text/css"
	href="//cdn.datatables.net/1.10.0/css/jquery.dataTables.css">
<link rel="stylesheet" href=<c:url value= "/resources/css/main1.css" /> />	
<!-- JQUERY CDN  -->
<script src="//code.jquery.com/jquery-1.10.1.min.js"></script>
<!-- DataTables -->
<script type="text/javascript" charset="utf8"
	src="//cdn.datatables.net/1.9.4/js/jquery.dataTables.js"></script>
<script src=<c:url value= "/resources/js/main.js" />> </script>
</head>
<body>
	
		<div class="main_wrapper">
			<header id="topheader">
				<span id="headerheading">
					<h1>Welcome to BondStone VideoStore</h1>
				</span> <span id="cartspan"> <c:if
						test="${not empty sessionScope.username}">
						<p>logged in as: ${sessionScope.username}</p>
					</c:if>
					<p>
						<a href="cart"> items in cart: ${fn:length(requestScope.cart)}</a>
					</p>
				</span>
				<nav id="navbar">
					<ul id="navlist">
						<li class="navlistitems"><a href="index">Home</a></li>
						<li class="navlistitems"><a href="search">Search</a></li>
						<li class="navlistitems"><a href="browse">Browse</a></li>
						<li class="navlistitems"><a href="profile">Profile</a></li>
						<li class="navlistitems"><a href="cart">Cart</a></li>
					</ul>
				</nav>
			</header>

			<div id="profile">


				<table>
					<form:form method="POST" modelAttribute="customerBean" >

						<c:forEach var="cust" items="${customerList}">
						<tr>

							<td>First Name: <form:input path="firstName" value="${cust.firstName}" /></td>
						</tr>
						<tr>
							<td>Last Name: <form:input path="lastName" value="${cust.lastName}" /></td>
						</tr>
						<tr>

							<td>Email Address: <form:input path="email" value="${cust.email}" /></td>
						</tr>
						<tr>
							<td>Current Store: <form:input path="storeId" value="${cust.storeId}"
									readonly="true" /></td>
						</tr>

					</c:forEach>
					</form:form>
				</table>
				
				<div class="history">
				
				 <datatables:table id="myTableId" data="${rentalhistory}"  sort="true" cssClass="historytable">
					<datatables:column title="RentalId" property="rentalId" />
					<datatables:column title="Title" property="title" />
					<datatables:column title="Store" property="storeId" />
					<datatables:column title="Rented" property="rentalDate" />
					<datatables:column title="Returned" property="returnDate" />
					<%--<datatables:column>
					 <form:form id="${filmList.filmId}" method="post" action="add" modelAttribute="cartItem" >
					<form:hidden value="${filmList.title}" path="title" />
					<form:hidden value="${flimList.rating}" path="rating" />
					<form:hidden value="${filmList.description}" path="description" />
					<form:hidden value="${filmList.rentalrate}" path="rentalrate" />
					<button >Add To Cart</button>
					</form:form> 
					</datatables:column>--%>
					
					
					
				</datatables:table>
				</div>



			</div>


		</div>
	
</body>
</html>
</sec:authorize>