package com.dariawan.app;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.dariawan.bean.Footer;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class SpringBeanFactoryApp {

    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);        
        Resource resource = new ClassPathResource("beans.xml");
        reader.loadBeanDefinitions(resource);

        Footer footer = (Footer) beanFactory.getBean("footer", Footer.class);
        System.out.println(footer.getSignature());
    }
}
