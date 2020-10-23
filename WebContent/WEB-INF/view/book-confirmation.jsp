<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Book Confirmation</title>
	</head>
	
	<body>
		<h2>Book Confirmation</h2>
		<br>
		Title: ${book.title}
		<br>
		Author: ${book.author}
		<br>
		Country: ${book.country}
		<br>
		Postal Code: ${book.postalCode}
		<br>
		Book Number: ${book.numberBook}
		<br>
		Cover:
		<ul>
			<c:forEach var="temp" items="${book.cover}">
				<li> ${temp} </li>
			</c:forEach>
		</ul>
		<br>
	</body>
</html>