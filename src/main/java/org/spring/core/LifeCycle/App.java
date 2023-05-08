package org.spring.core.LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        AbstractApplicationContext context =  new ClassPathXmlApplicationContext("file:////Users/vasanthkumar/IdeaProjects/SpringCore/src/main/java/org/spring/core/LifeCycle/Life_Cycle_config.xml");
        Samosa s = (Samosa) context.getBean("samosa1");
        System.out.println(s);
//
       context.registerShutdownHook(); //to enable custom destroy method
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        Pepsi p = (Pepsi) context.getBean("pepsi1");
        System.out.println(p);

       Example example = (Example)context.getBean("example1");
        System.out.println(example);
    }
}
