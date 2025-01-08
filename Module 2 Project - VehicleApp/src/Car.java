// The car class extends the Vehicle class and provides unique behaviors for the car vehicle type.

public class Car extends Vehicle {

    private int numberOfDoors; // The number of doors the car type has

    // Constructor for the car class that holds four parameters and initiates the car's attributes
    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    // Getters and Setters in case I need them later
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    // Calculates fuel efficiency and outputs efficiency for the car type in mph
    @Override
    public double calculateFuelEfficiency(double distance, double fuelUsed) {
        double efficiency = super.calculateFuelEfficiency(distance, fuelUsed);
        System.out.println("your car fuel efficiency is: " + efficiency + " mph");
        return efficiency;
    }

    // Sets the vehicle's state and prints a message for the car type
    @Override
    public void modifyVehicleState() {
        super.modifyVehicleState();
        System.out.println("Your " + getModel() + " is now  turned " + getState());
    }

    // Returns the number of doors for the car vehicle
    @Override
    public String toString() {
        return super.toString() + ", Car [numberOfDoors= " +  numberOfDoors + "]";
    }
}
