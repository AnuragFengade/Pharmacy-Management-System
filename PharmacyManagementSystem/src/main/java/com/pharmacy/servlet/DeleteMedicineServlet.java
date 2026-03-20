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

@WebServlet("/deleteMedicine")

public class DeleteMedicineServlet extends HttpServlet{

private static final long serialVersionUID=1L;

protected void doGet(HttpServletRequest req,HttpServletResponse res)
throws ServletException,IOException{

int id=Integer.parseInt(req.getParameter("id"));

try{

Connection con=DBConnection.getConnection();

PreparedStatement ps=con.prepareStatement(
"delete from medicine where id=?");

ps.setInt(1,id);

ps.executeUpdate();

res.sendRedirect("viewMedicine.jsp");

}catch(Exception e){
e.printStackTrace();
}

}
}