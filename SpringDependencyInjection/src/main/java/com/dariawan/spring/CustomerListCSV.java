package com.dariawan.spring;

import java.util.ArrayList;
import java.util.List;

public class CustomerListCSV implements CustomerList {

    @Override
    public List<Customer> getCustomers() {
        // sample data...
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("CSV", "Bianca"));
        customers.add(new Customer("CSV", "Celena"));
        customers.add(new Customer("CSV", "Elyssa"));
        
        return customers;
    }   
}
