package org.spring.core.JavaConfig;

import org.springframework.stereotype.Component;

//@Component
public class Student {

    private Samosa samosa;

    public Student(Samosa samosa) {
        this.samosa = samosa;
    }

    public Student() {
    }

    public void study(){
        this.samosa.price();
        System.out.println("Student is studying");
    }

    public Samosa getSamosa() {
        return samosa;
    }

    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "samosa=" + samosa +
                '}';
    }
}
