// This truck class/vehicle type extends vehicle and implements unique behaviors for trucks

public class Truck extends Vehicle {

    private double weightCapacity; // Weight capacity of the truck in tons


    // Constructor with four parameters that initializes the truck's attributes
    public Truck(String make, String model, int year, double weightCapacity) {
        super(make, model, year);
        this.weightCapacity = weightCapacity;
    }

    // Getters and Setters in case I need them later
    public double getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(double weightCapacity) {
        this.weightCapacity = weightCapacity;
    }

    // Calculates fuel efficiency and outputs efficiency for the car type in mph
    @Override
    public double calculateFuelEfficiency(double distance, double fuelUsed) {
        double efficiency = super.calculateFuelEfficiency(distance, fuelUsed);
        System.out.println("Your truck fuel efficiency is: " + efficiency + " mph");
        return efficiency;
    }

    // Sets the vehicle's state and prints a message for the truck type
    @Override
    public void modifyVehicleState() {
        super.modifyVehicleState();
        System.out.println("Your " + getModel() + " is now  turned " + getState());
    }

    // Returns the weight capacity for the truck
    @Override
    public String toString() {
        return super.toString() + ", Truck [weightCapacity=" + weightCapacity + " tons]";
    }


}
