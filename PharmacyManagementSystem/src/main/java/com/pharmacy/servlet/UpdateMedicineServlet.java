package com.pharmacy.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.pharmacy.dao.DBConnection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/updateMedicine")

public class UpdateMedicineServlet extends HttpServlet{

private static final long serialVersionUID=1L;

protected void doPost(HttpServletRequest req,HttpServletResponse res)
throws ServletException,IOException{

int id=Integer.parseInt(req.getParameter("id"));

String name=req.getParameter("name");

String company=req.getParameter("company");

double price=Double.parseDouble(req.getParameter("price"));

int quantity=Integer.parseInt(req.getParameter("quantity"));

try{

Connection con=DBConnection.getConnection();

PreparedStatement ps=con.prepareStatement(
"update medicine set name=?,company=?,price=?,quantity=? where id=?");

ps.setString(1,name);
ps.setString(2,company);
ps.setDouble(3,price);
ps.setInt(4,quantity);
ps.setInt(5,id);

ps.executeUpdate();

res.sendRedirect("viewMedicine.jsp");

}catch(Exception e){
e.printStackTrace();
}

}
}