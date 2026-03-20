 package com.pharmacy.dao;

import java.sql.*;
import java.util.*;
import com.pharmacy.model.Medicine;

public class MedicineDAO {

public static boolean addMedicine(Medicine m){

boolean status=false;

try{

Connection con=DBConnection.getConnection();

PreparedStatement ps=con.prepareStatement(
"insert into medicine(name,company,price,quantity) values(?,?,?,?)");

ps.setString(1,m.getName());
ps.setString(2,m.getCompany());
ps.setDouble(3,m.getPrice());
ps.setInt(4,m.getQuantity());

int i=ps.executeUpdate();

if(i>0) status=true;

}catch(Exception e){
e.printStackTrace();
}

return status;
}

public static List<Medicine> getAllMedicines(){

List<Medicine> list=new ArrayList<>();

try{

Connection con=DBConnection.getConnection();

Statement st=con.createStatement();

ResultSet rs=st.executeQuery("select * from medicine");

while(rs.next()){

Medicine m=new Medicine();

m.setId(rs.getInt("id"));

m.setName(rs.getString("name"));

m.setCompany(rs.getString("company"));

m.setPrice(rs.getDouble("price"));

m.setQuantity(rs.getInt("quantity"));

list.add(m);

}

}catch(Exception e){
e.printStackTrace();
}

return list;

}

}