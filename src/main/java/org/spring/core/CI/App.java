package org.spring.core.CI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("file:////Users/vasanthkumar/IdeaProjects/SpringCore/src/main/java/org/spring/core/CI/CI_config.xml");
        Person p = (Person)context.getBean("person");
        System.out.println(p);
        Addition a = (Addition) context.getBean("add");
        a.doSum();

    }

}
