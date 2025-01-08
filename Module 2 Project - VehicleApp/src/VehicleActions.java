// This interface defines methods that must be implemented by any vehicle class to ensure that all vehicle classes have consistent behaviors.

public interface VehicleActions
{
    // calculateFuelEfficiency will a calculate  the fuel efficiency of the vehicle being used. This method includes the distance and fuelUsed as parameters. These parameters serve as placeholders for user inputs.
    double calculateFuelEfficiency(double distance, double fuelUsed);
    // modifyVehicleState will be used to change the state of the vehicle based on user input
    void modifyVehicleState();
}
