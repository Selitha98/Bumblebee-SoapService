/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Database.DBconnection;
import Models.Orders;
import java.sql.Connection;
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
}
