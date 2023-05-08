package org.spring.core.Stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("obj1")
@Scope("prototype")
public class Teacher {
    @Value("Kumar")
    private String name;
    @Value("Visakhapatnam")
    private String city;
    @Value("1000")
    private int salary;

    public Teacher(String name, String city, int salary) {
        this.name = name;
        this.city = city;
        this.salary = salary;
    }

    public Teacher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", salary=" + salary +
                '}';
    }
}
