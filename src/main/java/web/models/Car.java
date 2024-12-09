package web.models;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String toString() {
        return "Make: " + make + ", model: " + model + ", year: " + year;
    }
}
