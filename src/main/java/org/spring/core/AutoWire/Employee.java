package org.spring.core.AutoWire;

public class Employee {
    private Address address;

    public Employee(Address address) {
        System.out.println("Constructor Injection");
        this.address = address;
    }

    public Employee() {
    }

    public Address getAddress() {
        return address;
    }

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
