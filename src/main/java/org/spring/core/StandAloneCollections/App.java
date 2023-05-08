package org.spring.core.StandAloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:////Users/vasanthkumar/IdeaProjects/SpringCore/src/main/java/org/spring/core/StandAloneCollections/standAlone_config.xml");
        Person p =  context.getBean("person1",Person.class);
        System.out.println(p);
        System.out.println(p.getFriends().getClass().getName());
        System.out.println(p.getFee().getClass().getName());
        System.out.println(p.getFee());
        System.out.println(p.getProps());
        System.out.println(p.getProps().getClass().getName());

    }
}
