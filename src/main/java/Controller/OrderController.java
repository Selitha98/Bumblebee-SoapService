/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Database.DBconnection;
import Models.Orders;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Selitha Sasmitha
 */
public class OrderController {
    
    public boolean customerOrder(Orders order){
        
        Connection connection = DBconnection.getConnection();
        
        try{
         
            Statement stam = connection.createStatement();
            int rows = stam.executeUpdate((" INSERT INTO `orders_table`(`id`,"
              + " `name`, `address`, `price`, `loan`, `birthday`, `plan`) VALUES ('"+order.getOrder_id()+"','"
            +order.getOrder_name()+"','"+order.getOrder_address()+"','"+order.getOrder_price()+"','"+order.getOrder_loan()+"','"+order.getOrder_birthday()+"','"+order.getOrder_plan()+"')"));
            
           return rows>0;
            
        }catch(Exception ex){
            System.out.println("ERROR"+" "+ex);
        }
         
        return false;
    }
    
    public boolean orderUpdate(Orders order) {
        
         Connection connection = DBconnection.getConnection(); 
         try {   
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate("UPDATE `orders_table` SET  `name` = '"
                    + order.getOrder_name() +  "', `address` = '" + order.getOrder_address() +"', `price` = '" + order.getOrder_price() + "', `loan` = '" + order.getOrder_loan() + "', `birthday` = '" + order.getOrder_birthday() + "', `plan` = '" + order.getOrder_plan() + "' WHERE (`id` = '"  + order.getOrder_id() + "')");
            
            return rows > 0;
            
        } catch (Exception ex){
            System.out.println("ERROR"+" "+ex);
        }  
        return false;
     }
    
    public boolean deleteOrder(String id){
    Connection connection = DBconnection.getConnection(); 
     
        try{
          Statement stmt=connection.createStatement();
           
          int rows=stmt.executeUpdate(" DELETE FROM `orders_table` WHERE "
           + "(`id`='"+id+"');");
      		
	    return rows>0;
	
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
}
