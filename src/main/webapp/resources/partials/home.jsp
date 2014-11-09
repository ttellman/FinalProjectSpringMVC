<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Film List</h1>
	<c:if test="${not empty filmList }">
		<table>
			<tr>
				<th>Title</th>
				<th>Rating</th>
			</tr>
			<c:forEach var="film" items="${filmList}">
				<tr>
					<td>${film.title}</td>
					<td>${film.rating}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>

	<c:if test="${empty filmList }">
		<div>No film found for your search!</div>
	</c:if>
</body>
</html>
