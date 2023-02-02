<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2> All Contacts </h2>
	<table border="1">
		<tr>
			<th> ID </th>
			<th> userid </th>
			<th> password </th>
			<th> fname </th>
			<th> lname </th>
			<th> email </th>
			<th> contact no </th>
		</tr>
		<c:forEach var="contact" items="${clist}">
			<tr>
			    <td> ${contact.cid} </td>
				<td> ${contact.uid } </td>
				<td> ${contact.password } </td>
				<td> ${contact.fnanme } </td>
				<td> ${contact.lname } </td>
				<td> ${contact.email } </td>
				<td> ${contact.contactno } </td>
				<td> <a href="edit?cid=${contact.cid}"> edit </a> </td>
				<td> <a href="delete?cid=${contact.cid}"> delete </a> </td>
			</tr>
		</c:forEach>
	</table>
	
	<a href="create"> Create New Contact </a>
</body>
</html>