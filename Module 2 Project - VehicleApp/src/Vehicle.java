// This is an abstract class that will implement the VehicleActions interface and will serve as the base class for different types of vehicles such as our Car and Truck objects/classes. With this more vehicle types can be added based on this vehicle abstraction.

import java.util.Scanner;

public abstract class Vehicle implements VehicleActions{
    private String make;
    private String model;
    private int year;
    private String state;

    // Constructor
    // This constructor contains three parameters: make, model, and year
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.state = "off"; // Needed for loop to function properly
    }

    // Getters and Setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // This method will perform the function that will calculate the fuel efficiency
    // This method has two parameters: distance and fuelUsed
    public double calculateFuelEfficiency(double distance, double fuelUsed) {
        return distance / fuelUsed;
    }

    // This method modifies the vehicle's state and provides an output to the console.
    // A loop is created  to ensure that a valid entry is used.
    public void  modifyVehicleState() {
        Scanner scanner = new Scanner(System.in);
        String newState;
        while (true) {
            System.out.println("Would you like your vehicle turned 'on' or 'off'?");
            newState = scanner.nextLine();

            if ("on".equalsIgnoreCase(newState) || "off".equalsIgnoreCase(newState)) {
                this.state = newState;
                System.out.println("Vehicle state changed to: " + this.state);
                break; // Exit the loop
            } else {
                System.out.println("Sorry, vehicles can only be turned 'on' or 'off'...");
            }
        }
    }

    // This  will return a string representation of the vehicle.
    // The @Override annotation will indicate that this method is providing a specific implementation of the toString method defined in the Object parent class.
    @Override
    public String toString() {
        return "Vehicle [make = " + make + ", model = " + model + ", year = " + year + "]";
    }
}
