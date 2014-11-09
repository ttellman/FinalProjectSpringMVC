<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<div id="header">
			<header>
				<h1>Welcome to video jibersish</h1>
				<div id="logo">
				
				</div>
				
			<nav class="navbar">
					<ul class="navlist">
					<li><a class="navlinks" href="home">Home</a></li>	
					<li><a class="navlinks" id="search" href="search" >Search</a></li>
					<li><a class="navlinks" href="browse">Browse</a></li>
					<li><a class="navlinks" href="profile">Profile</a></li>
					<li><a class="navlinks" href="cart">Cart</a></li>
					</ul>
					logged in as: ${pageContext.request.userPrincipal.name}
					<span id="cartspan">Items in cart: ${fn:length(requestScope.cart)} </span>
				</nav>
			</header>
		</div>