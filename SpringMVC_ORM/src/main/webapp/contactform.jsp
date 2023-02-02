<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2> Contact Form </h2>
	<f:form action="save" modelAttribute="con">
		Enter uid : <f:input path="uid"/> <br/>
		Enter pwd : <f:input path="password"/> <br/>
		Enter fname : <f:input path="fnanme"/> <br/>
		Enter lname : <f:input path="lname"/> <br/>
		Enter email : <f:input path="email"/> <br/>
		Enter contact : <f:input path="contactno"/> <br/>
		<input type="submit" value="Create New" />
	</f:form>
	
</body>
</html>