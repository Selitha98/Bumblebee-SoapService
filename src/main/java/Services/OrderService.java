/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package Services;

import Controller.OrderController;
import Models.Orders;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Selitha Sasmitha
 */
@WebService(serviceName = "OrderService")
public class OrderService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "customerOrder")
    public boolean Cus_ord(@WebParam(name="order")Orders order) {
        OrderController ord_controller = new OrderController();
        return ord_controller.customerOrder(order);
    }
    
    @WebMethod(operationName = "deleteOrder")
    public boolean deleteOrder(@WebParam(name="id") String id){
        OrderController del_controller = new OrderController();
        return del_controller.deleteOrder(id);
    }
    
    @WebMethod(operationName = "updateOrders")
        public boolean updateOrders(@WebParam(name="order")Orders order) {
        OrderController ord_update = new OrderController();
        return ord_update.orderUpdate(order);
    }
}
