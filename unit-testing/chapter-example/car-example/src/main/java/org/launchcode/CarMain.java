package org.launchcode;

public class CarMain {
    public static void main(String[] args) {
        ExCar car = new ExCar("Toyota", "Prius", 10, 50);
        System.out.println(car.getMake() + " - " + car.getModel());
    }
}