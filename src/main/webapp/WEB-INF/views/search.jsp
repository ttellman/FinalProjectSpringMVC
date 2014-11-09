<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="true"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="datatables"
	uri="http://github.com/dandelion/datatables"%>
<sec:authorize access="hasRole('ROLE_USER')">
	<!doctype html>
	<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BondStone Video Store</title>
<link rel="stylesheet" href=<c:url value= "/resources/css/reset.css" /> />
<!-- <link rel="stylesheet"	href=<c:url value= "/resources/css/bootstrap.css" /> /> -->
<link rel="stylesheet" href=<c:url value= "/resources/css/main1.css" /> />
<link rel="stylesheet"
	href=<c:url value="/resources/css/footable.core.css" /> />






<!-- JQUERY CDN  -->
<script src="//code.jquery.com/jquery-1.10.1.min.js"></script>
<script src="./resources/js/footable.js" type="text/javascript"></script>
<script src="./resources/js/footable.sort.js" type="text/javascript"></script>
<script src="./resources/js/footable.paginate.js" type="text/javascript"></script>

<script type="text/javascript">
	$(function() {

		$('.footable').footable();

	});
</script>
<script type="text/javascript">
$(document).ready(function(){
	$('#addToCartBTN').click(function doAjaxPost(e){
	e.preventDefault();
		var title = $('#title').val;
		var rating = $('#rating').val;
		var description = $('#description').val;
		var rentalrate = $('#rate').val; 
		var form = $(this);
		
		$.ajax({
			type: 'POST',
			url: form.attr('action'),
			data : 'title' + title + 'rating' + rating + 'description' + description + 'rentalrate' + rentalrate,
			sucess : function () {
				alert('added');
				},
				error :  function(e) {
						alert('Error: ' + e);
					}
			
			});
	
	
})



</script>
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

		<div id="searchDiv">
			<table id="searchtable">
				<form:form method="POST" modelAttribute="filmSearch">

					<tr>
						<td align="center">Title<form:input path="title" /></td>
						<td align="center">Category <form:select path="category">
								<form:option value="0" label="---Category---" />
								<form:options items="${sessionScope.categoryList}" />

							</form:select>
						</td>
					</tr>
					<tr>
						<td colspan="2" align="center"><input type="submit"
							value="Search"></td>
					</tr>
				</form:form>
			</table>
		</div>
		
		<c:if test="${not empty filmList }">
			<div id="resultDiv">




				<h1>Search Results</h1>

				<table id="example" class="footable display"  cellspacing="0" width="100%">
					<thead>
						<tr>
							<th class="tabhead">Title</th>
							<th class="tabhead">Rating</th>
							<th class="tabhead">Length</th>
							<!-- <th class="tabhead">Rental Rate</th> -->
							<th class="tabhead">Category</th>
							<!-- 	<th class="tabhead">FilmId</th> -->
						</tr>
					</thead>
					<tbody>

						<c:forEach var="film" items="${filmList}">

							<tr>
								<form:form id="${film.filmId}" method="post" action="add"
									modelAttribute="cartItem">
									<td nowrap>${film.title}</td>
									<td nowrap>${film.rating}</td>
									<td nowrap>${film.length}</td>
									<%-- <td nowrap>${film.rentalrate}</td> --%>
									<td nowrap>${film.category}</td>
									<td><form:hidden id="title" value="${film.title}" path="title" /></td>
									<td><form:hidden id="rating" value="${film.rating}" path="rating" /></td>
									<td><form:hidden id="description" value="${film.description}" path="description" /></td>
									<td><form:hidden id="rentalrate" value="${film.rentalrate}" path="rentalrate" /></td>
									<td><form:button title="click me to add to cart!"
											class="button green" id="addToCartBTN" onclick="doAjaxPost">
											<div class="title">Add to cart</div>
											<div class="price">$${film.rentalrate}</div>
										</form:button></td>
								</form:form>
							</tr>

						</c:forEach>

					</tbody>

				</table>
		</c:if>

		<c:if test="${(empty filmList) && (filmSearch.searched) }">
			<div>No film found for your search!</div>
		</c:if>

	</div>
	</div>


	</div>

</body>
	</html>
</sec:authorize>