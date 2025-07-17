package org.example;

public class Car extends Vehicle {
    public int numberOfDoors;

    public Car(String brand, int year, int price, int numberOfDoors) {
        super(brand, year, price);
        this.numberOfDoors = numberOfDoors;
    }
    @Override
    public double calculateInsurance() {
        return price * 0.05;
    }

    public void honk(){
        System.out.println("HONK HONK");
    }
}
