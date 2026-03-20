package com.pharmacy.servlet;

import java.io.IOException;

import com.pharmacy.dao.MedicineDAO;
import com.pharmacy.model.Medicine;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addMedicine")

public class AddMedicineServlet extends HttpServlet{

private static final long serialVersionUID=1L;

protected void doPost(HttpServletRequest req,HttpServletResponse res)
throws ServletException,IOException{

String name=req.getParameter("name");
String company=req.getParameter("company");

double price=Double.parseDouble(req.getParameter("price"));

int quantity=Integer.parseInt(req.getParameter("quantity"));

Medicine m=new Medicine(name,company,price,quantity);

boolean status=MedicineDAO.addMedicine(m);

if(status){
res.sendRedirect("viewMedicine.jsp");
}

}
}