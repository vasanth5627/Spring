package org.spring.core.Stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("obj")
@Scope("prototype")
public class Student {
    @Value("vasanth")
    private String StudentName;
    @Value("Srikakulam")
    private String city;

    @Value("#{temp}")
    private List<String> address;

    @Override
    public String toString() {
        return "Student{" +
                "StudentName='" + StudentName + '\'' +
                ", city='" + city + '\'' +
                ", address=" + address +
                '}';
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }



    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
