<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Add new book</title>
		<style>
			.error{color:red}
		</style>
	</head>

	<body>
		<form:form action="processForm" modelAttribute="book">
		
			<h1>Add new book</h1>
			<br><br>
		
			Title: <form:input path="title"/>
			<form:errors path="title" cssClass="error"/>
			<br><br>
			
			Author: <form:input path="author"/>
			<form:errors path="author" cssClass="error"/>
			<br><br>
			
			Country: <form:select path="country">
							<form:options items="${book.countryOptions}"/>
					</form:select>
			<br><br>
			
			Postal Code:<form:input path="postalCode"/>
			<form:errors path="postalCode" cssClass="error"/>
			<br><br>
			
			Book Number: <form:input path="numberBook"/>
			<form:errors path="numberBook" cssClass="error"/>
			
			<br><br>
			Cover: 
				Soft <form:checkbox path="cover" value="soft"/>
				Hard <form:checkbox path="cover" value="hard"/>
		
		 	<input type="submit" value="Add" />
		 	
		</form:form>
	</body>
		
</html>