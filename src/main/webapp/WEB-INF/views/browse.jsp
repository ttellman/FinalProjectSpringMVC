<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="true"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BondStone Video Store</title>
<link rel="stylesheet" href=<c:url value= "/resources/css/reset.css" /> />
<link rel="stylesheet" href=<c:url value= "/resources/css/main1.css" /> />
<script src="//code.jquery.com/jquery-1.10.1.min.js"></script>
<script type="text/javascript"
	src=<c:url value="/resources/js/jquery.jcarousel.min.js" />></script>
<script type="text/javascript"
	src=<c:url value="/resources/js/jcarousel.ajax.js" />></script>

</head>
<body>
	<div class="main_wrapper">
		<header id="topheader">
			<span id="headerheading">
				<h1>Welcome to BondStone Video Store</h1>
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
	</div>
	<div id="main_browse">

		<div id="slider" class="browsecat">
			<table>
				<thead>
					<tr>
						<td>
							<h3>Action</h3>
						</td>
					</tr>
				</thead>
				<tbody>
					<tr>
						<c:forEach var="actionFilm" items="${actionList}">
							<td><span class="moviediv" title="${actionFilm.description}">
									Title: ${actionFilm.title}
									<p>Length: ${actionFilm.length}min</p>
									<button class="button green">
										<div class="title">Add to cart</div>
										<div class="price">$${actionFilm.rentalrate}</div>
									</button>

							</span></td>
						</c:forEach>



					</tr>
				</tbody>
			</table>
		</div>


		<div id="animation" class="browsecat">
			<table>
				<thead>
					<tr>
						<td>
							<h3>Animation</h3>
						</td>
					</tr>
				</thead>
				<tbody>
					<tr>
						<c:forEach var="animaFilm" items="${animationList}">
							<td><span class="moviediv" title="${animaFilm.description}">
									Title: ${animaFilm.title}
									<p>Length: ${animaFilm.length}min</p>
									<button class="button green">
										<div class="title">Add to cart</div>
										<div class="price">$${animaFilm.rentalrate}</div>
									</button>
							</span></td>

						</c:forEach>
					</tr>
				</tbody>
			</table>
		</div>


		<div id="children" class="browsecat">
			<table>
				<thead>
					<tr>
						<td>
							<h3>Children</h3>
						</td>
					</tr>
				</thead>
				<tbody>
					<tr>

						<c:forEach var="childrenFilm" items="${childrenList}">
							<td><span class="moviediv"
								title="${childrenFilm.description}"> Title:
									${childrenFilm.title}
									<p>Length: ${childrenFilm.length}min</p>
									<button class="button green">
										<div class="title">Add to cart</div>
										<div class="price">$${childrenFilm.rentalrate}</div>
									</button>
							</span></td>
						</c:forEach>
				</tbody>
			</table>

		</div>

		<div id="classics" class="browsecat">
			<table>
				<thead>
					<tr>
						<td>
							<h3>Classics</h3>
						</td>
					</tr>
				</thead>
				<tbody>
					<tr>

						<c:forEach var="classicsFilm" items="${classicsList}">
							<td><span class="moviediv"
								title="${classicsFilm.description}"> Title:
									${classicsFilm.title}
									<p>Length: ${classicsFilm.length}min</p>
									<button class="button green">
										<div class="title">Add to cart</div>
										<div class="price">$${classicsFilm.rentalrate}</div>
									</button>
							</span></td>
						</c:forEach>
				</tbody>
			</table>



		</div>


		<div id="comedy" class="browsecat">
			<table>
				<thead>
					<tr>
						<td>
							<h3>Comedy</h3>
						</td>
					</tr>
				</thead>
				<tbody>
					<tr>

						<c:forEach var="comedyFilm" items="${comedyList}">
							<td><span class="moviediv" title="${comedyFilm.description}">
									Title: ${comedyFilm.title}
									<p>Length: ${comedyFilm.length}min</p>
									<button class="button green">
										<div class="title">Add to cart</div>
										<div class="price">$${comedyFilm.rentalrate}</div>
									</button>
							</span></td>
						</c:forEach>
				</tbody>
			</table>

		</div>

		<div id="documentary" class="browsecat">

			<table>
				<thead>
					<tr>
						<td>
							<h3>Documentary</h3>
						</td>
					</tr>
				</thead>
				<tbody>
					<tr>

						<c:forEach var="documentaryFilm" items="${documentaryList}">
							<td><span class="moviediv"
								title="${documentaryFilm.description}"> Title:
									${documentaryFilm.title}
									<p>Length: ${documentaryFilm.length}min</p>
									<button class="button green">
										<div class="title">Add to cart</div>
										<div class="price">$${docuentaryFilm.rentalrate}</div>
									</button>
							</span></td>
						</c:forEach>
				</tbody>
			</table>

		</div>

		<div id="drama" class="browsecat">
			<table>
				<thead>
					<tr>
						<td>
							<h3>Drama</h3>
						</td>
					</tr>
				</thead>
				<tbody>
					<tr>

						<c:forEach var="dramaFilm" items="${dramaList}">
							<td><span class="moviediv" title="${dramaFilm.description}">
									Title: ${dramaFilm.title}
									<p>Length: ${dramaFilm.length}min</p>
									<button class="button green">
										<div class="title">Add to cart</div>
										<div class="price">$${dramaFilm.rentalrate}</div>
									</button>
							</span></td>
						</c:forEach>
				</tbody>
			</table>

		</div>

		<div id="family" class="browsecat">
			<table>
				<thead>
					<tr>
						<td>
							<h3>Family</h3>
						</td>
					</tr>
				</thead>
				<tbody>
					<tr>

						<c:forEach var="familyFilm" items="${familyList}">
							<td><span class="moviediv" title="${familyFilm.description}">
									Title: ${familyFilm.title}
									<p>Length: ${familyFilm.length}min</p>
									<button class="button green">
										<div class="title">Add to cart</div>
										<div class="price">$${familyFilm.rentalrate}</div>
									</button>
							</span></td>
						</c:forEach>
				</tbody>
			</table>

		</div>

		<div id="foreign" class="browsecat">
			<table>
				<thead>
					<tr>
						<td>
							<h3>Foreign</h3>
						</td>
					</tr>
				</thead>
				<tbody>
					<tr>

						<c:forEach var="foreignFilm" items="${foreignList}">
							<td><span class="moviediv"
								title="${foreignFilm.description}"> Title:
									${foreignFilm.title}
									<p>Length: ${foreignFilm.length}min</p>
									<button class="button green">
										<div class="title">Add to cart</div>
										<div class="price">$${foreignFilm.rentalrate}</div>
									</button>
							</span></td>
						</c:forEach>
				</tbody>
			</table>

		</div>

		<div id="games" class="browsecat">
			<table>
				<thead>
					<tr>
						<td>
							<h3>Games</h3>
						</td>
					</tr>
				</thead>
				<tbody>
					<tr>

						<c:forEach var="gamesFilm" items="${gamesList}">
							<td><span class="moviediv" title="${gamesFilm.description}">
									Title: ${gamesFilm.title}
									<p>Length: ${gamesFilm.length}min</p>
									<button class="button green">
										<div class="title">Add to cart</div>
										<div class="price">$${gamesFilm.rentalrate}</div>
									</button>
							</span></td>
						</c:forEach>
				</tbody>
			</table>

		</div>

		<div id="horror" class="browsecat">
			<table>
				<thead>
					<tr>
						<td>
							<h3>Horror</h3>
						</td>
					</tr>
				</thead>
				<tbody>
					<tr>

						<c:forEach var="horrorFilm" items="${horrorList}">
							<td><span class="moviediv" title="${horrorFilm.description}">
									Title: ${horrorFilm.title}
									<p>Length: ${horrorFilm.length}min</p>
									<button class="button green">
										<div class="title">Add to cart</div>
										<div class="price">$${horrorFilm.rentalrate}</div>
									</button>
							</span></td>
						</c:forEach>
				</tbody>
			</table>

		</div>

		<div id="music" class="browsecat">
			<table>
				<thead>
					<tr>
						<td>
							<h3>Music</h3>
						</td>
					</tr>
				</thead>
				<tbody>
					<tr>

						<c:forEach var="musicFilm" items="${musicList}">
							<td><span class="moviediv" title="${musicFilm.description}">
									Title: ${musicFilm.title}
									<p>Length: ${musicFilm.length}min</p>
									<button class="button green">
										<div class="title">Add to cart</div>
										<div class="price">$${musicFilm.rentalrate}</div>
									</button>
							</span></td>
						</c:forEach>
				</tbody>
			</table>

		</div>

		<div id="new" class="browsecat">
			<table>
				<thead>
					<tr>
						<td>
							<h3>New</h3>
						</td>
					</tr>
				</thead>
				<tbody>
					<tr>

						<c:forEach var="newFilm" items="${newList}">
							<td><span class="moviediv" title="${newFilm.description}">
									Title: ${newFilm.title}
									<p>Length: ${newFilm.length}min</p>
									<button class="button green">
										<div class="title">Add to cart</div>
										<div class="price">$${newFilm.rentalrate}</div>
									</button>
							</span></td>
						</c:forEach>
				</tbody>
			</table>

		</div>
		<div id="scifi" class="browsecat">
			<table>
				<thead>
					<tr>
						<td>
							<h3>Sci-Fi</h3>
						</td>
					</tr>
				</thead>
				<tbody>
					<tr>

						<c:forEach var="scifiFilm" items="${scifiList}">
							<td><span class="moviediv" title="${scifiFilm.description}">
									Title: ${scifiFilm.title}
									<p>Length: ${scifiFilm.length}min</p>
									<button class="button green">
										<div class="title">Add to cart</div>
										<div class="price">$${scifiFilm.rentalrate}</div>
									</button>
							</span></td>
						</c:forEach>
				</tbody>
			</table>

		</div>
		<div id="sports" class="browsecat">
			<table>
				<thead>
					<tr>
						<td>
							<h3>Sports</h3>
						</td>
					</tr>
				</thead>
				<tbody>
					<tr>

						<c:forEach var="sportsFilm" items="${sportsList}">
							<td><span class="moviediv" title="${sportsFilm.description}">
									Title: ${sportsFilm.title}
									<p>Length: ${sportsFilm.length}min</p>
									<button class="button green">
										<div class="title">Add to cart</div>
										<div class="price">$${sportsFilm.rentalrate}</div>
									</button>
							</span></td>
						</c:forEach>
				</tbody>
			</table>

		</div>
		<div id="travel" class="browsecat">
			<table>
				<thead>
					<tr>
						<td>
							<h3>Travel</h3>
						</td>
					</tr>
				</thead>
				<tbody>
					<tr>

						<c:forEach var="travelFilm" items="${travelList}">
							<td><span class="moviediv" title="${travelFilm.description}">
									Title: ${travelFilm.title}
									<p>Length: ${travelFilm.length}min</p>
									<button class="button green">
										<div class="title">Add to cart</div>
										<div class="price">$${travelFilm.rentalrate}</div>
									</button>
							</span></td>
						</c:forEach>
				</tbody>
			</table>

		</div>
</body>
</html>