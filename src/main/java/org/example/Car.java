package org.example;

public class Car extends Vehicle {
    private final int numberOfDoors; // Make private as controlled access and final because doors on vehicle won't change after declared

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

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
