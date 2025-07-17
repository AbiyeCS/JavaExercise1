package org.example;

public class Motorcycle extends Vehicle {
    public boolean hasWindshield;

    public Motorcycle(String brand, int year, int price, boolean hasWindshield) {
        super(brand, year, price);
        this.hasWindshield = hasWindshield;
    }

    @Override
    public double calculateInsurance() {
        return price * 0.08;
    }

    public void revEngine(){
        System.out.println("Revenging Engine");
    }
}
