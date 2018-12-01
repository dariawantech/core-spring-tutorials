package com.dariawan.spring;

import java.util.List;

public class CustomerPrint {
    private CustomerList customerList;

    /**
     * @param customerList the customerList to set
     */
    public void setCustomerList(CustomerList customerList) {
        this.customerList = customerList;
    }
    
    public void print() {
        // This is just example
        // This will actually work without adding any line of code
        List<Customer> customers = customerList.getCustomers();
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
