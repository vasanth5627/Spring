package org.spring.core.AutoWire.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:////Users/vasanthkumar/IdeaProjects/SpringCore/src/main/java/org/spring/core/AutoWire/Annotation/AutoConfig.xml");
        Employee e  = (Employee) context.getBean("Emp");
        System.out.println(e);
    }
}
