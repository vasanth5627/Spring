package org.spring.core;

public class Student {
    private int sId;
    private String sName;
    private String sAddress;

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        System.out.println("Setting student ID");
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        System.out.println("Setting Student Name");
        this.sName = sName;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        System.out.println("setting Student Address");
        this.sAddress = sAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sAddress='" + sAddress + '\'' +
                '}';
    }

    public Student() {

    }

    public Student(int sId, String sName, String sAddress) {
        this.sId = sId;
        this.sName = sName;
        this.sAddress = sAddress;
    }
}
