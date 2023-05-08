package org.spring.core.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    @Value("#{22+11}")
    private int x;
    @Value("#{10-10}")
    private int y;
    @Value("#{T(java.lang.Math).sqrt(144)}")
    private double z;
    @Value("#{T(java.lang.Math).E}")
    private double e;
    @Value("#{8>3}")
    private boolean isactive;




    @Value("#{new java.lang.String('Vasanth')}")
    private String name;

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", e=" + e +
                ", isactive=" + isactive +
                ", name='" + name + '\'' +
                '}';
    }
}
