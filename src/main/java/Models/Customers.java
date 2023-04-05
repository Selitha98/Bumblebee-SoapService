/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Selitha Sasmitha
 */
public class Customers {
    
    private String customer_id;
    private String customer_name;
    private String customer_email;
    private String password;
    private boolean isValide;

    public Customers(String customer_id, String customer_name, String customer_email, String password, boolean isValide) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_email = customer_email;
        this.password = password;
        this.isValide = isValide;
    }

    public Customers() {
    }

    
    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIsValide() {
        return isValide;
    }

    public void setIsValide(boolean isValide) {
        this.isValide = isValide;
    }
    
    
}
