package org.spring.core.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
    private String eName;
    private List<String> phones;
    private Set<String> address;
    private Map<String,String> courses;
    private String[] family;

    public Emp(String eName, List<String> phones, Set<String> address, Map<String, String> courses, String[] family) {
        this.eName = eName;
        this.phones = phones;
        this.address = address;
        this.courses = courses;
        this.family = family;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eName='" + eName + '\'' +
                ", phones=" + phones +
                ", address=" + address +
                ", courses=" + courses +
                ", family=" + Arrays.toString(family) +
                '}';
    }

    public Emp() {
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public String[] getFamily() {
        return family;
    }

    public void setFamily(String[] family) {
        this.family = family;
    }
}
