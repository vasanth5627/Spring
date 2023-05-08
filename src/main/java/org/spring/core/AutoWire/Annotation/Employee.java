package org.spring.core.AutoWire.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    @Autowired
    @Qualifier("address1")
    private Address address;

  // @Autowired
    public Employee(Address address) {
        System.out.println("Constructor Injection");
        this.address = address;
    }

    public Employee() {
    }

    public Address getAddress() {
        return address;
    }

  //  @Autowired
    public void setAddress(Address address) {
        System.out.println("setting Values");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
