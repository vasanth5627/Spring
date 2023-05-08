package org.spring.core.Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("file:////Users/vasanthkumar/IdeaProjects/SpringCore/src/main/java/org/spring/core/Stereotype/Stero_config.xml");
        Student student = context.getBean("obj",Student.class);
//        System.out.println(student);
//        System.out.println(student.getAddress());
//        System.out.println(student.getAddress().getClass().getName());
        System.out.println(student.hashCode());

        Student student1= context.getBean("obj",Student.class);
        System.out.println(student1.hashCode());

        Teacher teacher = context.getBean("obj1",Teacher.class);
        System.out.println(teacher);
        System.out.println(teacher.hashCode());

        Teacher teacher1 = context.getBean("obj1",Teacher.class);
        System.out.println(teacher1.hashCode());


    }
}
