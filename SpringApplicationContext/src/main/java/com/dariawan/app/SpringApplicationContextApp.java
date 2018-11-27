package com.dariawan.app;

import com.dariawan.bean.Footer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplicationContextApp {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");

        Footer footer = appContext.getBean("footer", Footer.class);

        System.out.println(footer.getSignature());
    }
}
