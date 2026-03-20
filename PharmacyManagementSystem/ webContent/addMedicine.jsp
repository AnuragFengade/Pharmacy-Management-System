 <%@ page language="java" contentType="text/html; charset=UTF-8"%>

<html>
<head>
<title>Add Medicine</title>
</head>

<body>

<h2>Add Medicine</h2>

<form action="AddMedicineServlet" method="post">

Medicine Name:
<input type="text" name="name"><br><br>

Price:
<input type="text" name="price"><br><br>

Quantity:
<input type="text" name="quantity"><br><br>

<input type="submit" value="Add Medicine">

</form>

<br>

<a href="dashboard.jsp">Back to Dashboard</a>

</body>
</html>