package com.dariawan.app;

import com.dariawan.bean.Footer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringPrototypeBeanApp {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("beans-prototype.xml");

        Footer footer1 = appContext.getBean("footer", Footer.class);
        footer1.setSignature("Just another Java programmer");
        System.out.println(footer1.getSignature());
        
        Footer footer2 = appContext.getBean("footer", Footer.class);
        System.out.println(footer2.getSignature());
        
        footer2.setSignature("Hello world! @Dariawan");
        System.out.println(footer2.getSignature());        
    }
}

/* 
Output:
------    
Just another Java programmer
null
Hello world! @Dariawan
*/