package org.example;

public abstract class Vehicle {
    protected String brand;
    protected int year;
    protected int price;

    public Vehicle(String brand, int year, int price) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Brand cannot be null or empty");
        }

        if (year < 1900) {
            throw new IllegalArgumentException("I'm sure your car is not that old!");
        }

        if (price < 0) {
            throw new IllegalArgumentException("Car price cannot be negative");
        }

        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    public void start(){
        System.out.println("VROOOM, Vehicle Starting");
    }

    public void stop(){
        System.out.println("Vehicle Stopping");
    }

    abstract double calculateInsurance();

    public String getBrand() {
        return brand;
    }
    public int getYear() {
        return year;
    }
    public int getPrice() {
        return price;
    }
}
