package org.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;
import java.io.File;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
   //     System.out.println( "Hello World!" );
 //       System.out.println(System.getProperty("user.dir"));
     //   File f= new File("/Users/vasanthkumar/IdeaProjects/SpringCore/src/main/java");
//        File f= new File(System.getProperty("user.dir")+"/src/main/java/org/spring/core");
//        File f1 = new File("/Users/vasanthkumar/IdeaProjects/SpringCore/src/main/java/org/spring/core/col_config.xml");
//        System.out.println(f1.length());
//        f.mkdir();
//        String[] list = f.list();
//        Arrays.stream(list).forEach(e-> System.out.println(e));

        ApplicationContext context = new ClassPathXmlApplicationContext("file:////Users/vasanthkumar/IdeaProjects/SpringCore/src/main/java/org/spring/core/standAlone_config.xml");
            Student student1 =  (Student) context.getBean("student1");
        System.out.println(student1);
        Student student2 =  (Student) context.getBean("student2");
        System.out.println(student2);
    }
}
