package org.spring.core.LifeCycle;

public class Samosa {
    private double price;

    public double getPrice() {
        System.out.println("Getting price");
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting price");
        this.price = price;
    }

    public Samosa() {

    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public void  init(){
        System.out.println("Inside Init Method");
    }

    public void destroy(){
        System.out.println("Inside  Destroy Method");
    }

    public void  hey(){
        System.out.println("hey !! Inside Init Method");
    }

    public void bye(){
        System.out.println("Bye!! Inside  Destroy Method");
    }
}
