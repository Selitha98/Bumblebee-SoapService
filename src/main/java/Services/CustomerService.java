/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package Services;

import Controller.CustomerController;
import Models.Customers;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Selitha Sasmitha
 */
@WebService(serviceName = "CustomerService")
public class CustomerService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "registerCustomer")
    public boolean Cus_reg(@WebParam(name="customer")Customers customer) {
        CustomerController cus_controller = new CustomerController();
        return cus_controller.customerRegister(customer);
        
    }
    
    @WebMethod(operationName = "loginCustomer")
    public Customers loginCustomer(@WebParam(name = "id") String id,
    @WebParam(name = "password")String password)  {
    CustomerController customeOpe=new CustomerController();
    return  customeOpe.Login(id, password);
    }
}
