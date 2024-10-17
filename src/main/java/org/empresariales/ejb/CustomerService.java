package org.empresariales.ejb;

import org.empresariales.model.Customer;
import org.empresariales.model.CustomerDAO;

import java.util.List;

public class CustomerService {

    public static List<Customer> getCustomers(){
        return CustomerDAO.getCustomer();
    }
}
