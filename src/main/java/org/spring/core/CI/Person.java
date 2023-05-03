package org.spring.core.CI;

import java.util.List;

public class Person {
    private String name;
    private int pid;

    private Certi c;

    private List<String> numbers;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", pid=" + pid +
                ", c=" + c +
                ", numbers=" + numbers +
                '}';
    }

    public Person(String name, int pid, Certi c, List numbers) {
        this.name = name;
        this.pid = pid;
        this.c = c;
        this.numbers = numbers;
    }

}
