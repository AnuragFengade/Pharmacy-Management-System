 <%@ page import="java.sql.*" %>
<%@ page import="com.pharmacy.dao.DBConnection" %>

<%

int id=Integer.parseInt(request.getParameter("id"));

Connection con=DBConnection.getConnection();

PreparedStatement ps=con.prepareStatement(
"select * from medicine where id=?");

ps.setInt(1,id);

ResultSet rs=ps.executeQuery();

rs.next();

%>

<h2>Edit Medicine</h2>

<form action="updateMedicine" method="post">

<input type="hidden" name="id" value="<%=rs.getInt("id")%>">

Name
<input type="text" name="name" value="<%=rs.getString("name")%>">

Company
<input type="text" name="company" value="<%=rs.getString("company")%>">

Price
<input type="number" name="price" value="<%=rs.getDouble("price")%>">

Quantity
<input type="number" name="quantity" value="<%=rs.getInt("quantity")%>">

<input type="submit" value="Update">

</form>
 