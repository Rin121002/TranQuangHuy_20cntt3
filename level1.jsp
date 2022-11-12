<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="level_I" method="post">
    <label>Processor</label> <br>
 
    <input type="radio" name="Processor" value="Celeron D" > Celeron D <br>
    <input type="radio" name="Processor" value="Pentium IV" > Pentium IV <br>
    <input type="radio" name="Processor" value="Pentium D" > Pentium D <br>
    
    <label>Accessories</label>
    <input type="checkbox" name="Accessories" value="Monitor " > Monitor <br>
    <select name ="Option">
     <option  value="camera" >camera </option>
     <option  value="Printer" >Printer </option>
    <option  value="Scanner" >Scanner </option>
    </select>
    <input type="submit" value="PURCHASE"/><br>
 </form>
</body>
</html>