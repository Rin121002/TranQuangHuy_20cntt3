<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>**CART**</h1>
<table border = "1">
 <tr>
 <td>Processor</td>
 <td><%=  request.getParameter("Processor")%></td>
 </tr>
<tr>
<td>   Accessories</td>
<td>  <%= request.getParameter("Accessories")%> <br>
       <%= request.getParameter("Option")%>  </td>
   </tr>
</table>
</body>

</html>