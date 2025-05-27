import java.util.*;

public class Car {
    String make;
    String model;
    int year;

    public void displayDetails() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.make = "Toyota";
        car1.model = "Corolla";
        car1.year = 2020;

        Car car2 = new Car();
        car2.make = "Ford";
        car2.model = "Mustang";
        car2.year = 2022;

        car1.displayDetails();
        car2.displayDetails();
    }
}
