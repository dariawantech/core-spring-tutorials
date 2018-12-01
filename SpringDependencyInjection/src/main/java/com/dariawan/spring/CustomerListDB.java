package com.dariawan.spring;

import java.util.ArrayList;
import java.util.List;

public class CustomerListDB implements CustomerList {

    @Override
    public List<Customer> getCustomers() {
        // sample data...
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("DB", "Barbara"));
        customers.add(new Customer("DB", "Cassandra"));
        customers.add(new Customer("DB", "Daryna"));
        
        return customers;
    }    
}
