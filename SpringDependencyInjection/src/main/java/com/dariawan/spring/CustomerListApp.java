package com.dariawan.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerListApp {
    
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("beans-customer-list.xml");
        CustomerPrint customerPrint = appContext.getBean("customerPrint", CustomerPrint.class);
        customerPrint.print();
    }
}
