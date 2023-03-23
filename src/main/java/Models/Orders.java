/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Selitha Sasmitha
 */
public class Orders {
    
    private String Order_id;
    private String Order_name;
    private String Order_address;
    private String Order_price;
    private String Order_loan;
    private String Order_birthday;
    private String Order_plan;

    public Orders(String Order_id, String Order_name, String Order_address, String Order_price, String Order_loan, String Order_birthday, String Order_plan) {
        this.Order_id = Order_id;
        this.Order_name = Order_name;
        this.Order_address = Order_address;
        this.Order_price = Order_price;
        this.Order_loan = Order_loan;
        this.Order_birthday = Order_birthday;
        this.Order_plan = Order_plan;
    }

    public Orders() {
    }

    
    
    public String getOrder_id() {
        return Order_id;
    }

    public void setOrder_id(String Order_id) {
        this.Order_id = Order_id;
    }

    public String getOrder_name() {
        return Order_name;
    }

    public void setOrder_name(String Order_name) {
        this.Order_name = Order_name;
    }

    public String getOrder_address() {
        return Order_address;
    }

    public void setOrder_address(String Order_address) {
        this.Order_address = Order_address;
    }

    public String getOrder_price() {
        return Order_price;
    }

    public void setOrder_price(String Order_price) {
        this.Order_price = Order_price;
    }

    public String getOrder_loan() {
        return Order_loan;
    }

    public void setOrder_loan(String Order_loan) {
        this.Order_loan = Order_loan;
    }

    public String getOrder_birthday() {
        return Order_birthday;
    }

    public void setOrder_birthday(String Order_birthday) {
        this.Order_birthday = Order_birthday;
    }

    public String getOrder_plan() {
        return Order_plan;
    }

    public void setOrder_plan(String Order_plan) {
        this.Order_plan = Order_plan;
    }
    
    
}
