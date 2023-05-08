package org.spring.core.reference;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:////Users/vasanthkumar/IdeaProjects/SpringCore/src/main/java/org/spring/core/reference/ref_config.xml");
       A temp = (A) context.getBean("aref");
        System.out.println(temp);

//        Resource resource = new ClassPathResource("file:////Users/vasanthkumar/IdeaProjects/SpringCore/src/main/java/org/spring/core/reference/ref_config.xml");
//        BeanFactory factory = new XmlBeanFactory(resource);
//         B b = (B) factory.getBean("b");
  //       B b =  factory.getBean("b",B.class);
//        System.out.println(b);



    }
}
