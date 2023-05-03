package org.spring.core.LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
    private double price;

    public Pepsi() {

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception { //inti method
        System.out.println("Initialization init method using interface");
        System.out.println("Taking Pepsi");
    }

    @Override
    public void destroy() throws Exception { //destroy method
        System.out.println("Destroy Method");
        System.out.println("Throwing Pespi");
    }
}
