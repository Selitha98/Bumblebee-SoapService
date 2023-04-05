/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Database.DBconnection;
import Models.Customers;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Selitha Sasmitha
 */
public class CustomerController {
    
    public boolean customerRegister(Customers customer){
        
        Connection connection=DBconnection.getConnection();
        
        try{
         
            Statement stam=connection.createStatement();
            int rows=stam.executeUpdate((" INSERT INTO `registor`(`id`,"
              + " `name`, `email`, `password`) VALUES ('"+customer.getCustomer_id()+"','"
            +customer.getCustomer_name()+"','"+customer.getCustomer_email())+"','"+customer.getPassword()+"')");
            
           return rows>0;
            
        }catch(Exception ex){
            System.out.println("ERROR"+" "+ex);
        }
         
        return false;
    }
    
    public Customers Login(String id,String password){
        
        final Connection connection = DBconnection.getConnection();
        String sql_query="SELECT*FROM registor WHERE id=? and password=?";
        Customers customer=null;
        
        
        try{
            PreparedStatement stmt = connection.prepareStatement(sql_query);
            stmt.setString(1, id);
            stmt.setString(2, password);
            
            ResultSet rs=stmt.executeQuery();
            
            while(rs.next()) {
				
				
		customer = new Customers();
		customer.setCustomer_id(id);
		customer.setPassword(password);
		customer.setIsValide(true);
				
		}
            
        }catch(Exception ex){
            System.out.println("ERROR"+ex);
        }
        return customer;
    }
    
    public boolean customerUpdate(Customers customer) {
        
         Connection connection = DBconnection.getConnection(); 
         try {   
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate("UPDATE `registor` SET  `name` = '"
                    + customer.getCustomer_name() +  "', `email` = '" + customer.getCustomer_email() +"', `password` = '" + customer.getPassword()+"' WHERE (`id` = '"  + customer.getCustomer_id() + "')");
            
            return rows > 0;
            
        } catch (Exception ex){
            System.out.println("ERROR"+" "+ex);
        }  
        return false;
     }
    
    public boolean deleteCustomer(String id){
    Connection connection = DBconnection.getConnection(); 
     
        try{
          Statement stmt=connection.createStatement();
           
          int rows=stmt.executeUpdate(" DELETE FROM `registor` WHERE "
           + "(`id`='"+id+"');");
      		
	    return rows>0;
	
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
}
