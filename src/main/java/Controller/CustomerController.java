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
}
