package org.spring.core.JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "org.spring.core.JavaConfig")
public class JavaConfig {
    @Bean
    public Samosa getSamosa(){
        return new Samosa();
    }
    @Bean(name = {"student","temp","con"})
    public Student getStudent(){
        //creating a new student object
        return new Student(getSamosa());
    }

}
