import java.util.Scanner;

/*
    David Winter
    COP-3330C Object Oriented Programing
    09/13/2024

    Program Objective:

    -Create a public interface.  Declare at least 2 methods that all implementing classes must override.
    -Create a parent class that implements the interface.  The parent class must include:
        -three attributes with at least 2 different data types (these are things that all children will have)
        -a constructor
        -getter/setter methods
        -two methods
            -the first method must make some sort of calculation, using user input.
            -the second method must modify an object's state or attributes in some way, using user input.
        -a toString method
    -Create two child classes that extend the parent class.
        -these classes should override methods from the parent class in a way that reflects their unique characteristics.
        -In each child class, be sure to override the toString() method, as well as the 2 custom methods you've created.
    -To help structure your code, create a UML diagram that represents steps 1, 2, and 3 above.  Be sure your diagram demonstrates visibility, return types, method arguments, data types, and inheritance/polymorphism as it applies to the classes you've designed.

    This program will take user input to change the values of various vehicle types to demonstrate inheritance, polymorphism, and abstraction. It will make use of an array to change the attributes of 5 different vehicles and perform calculations based on their unique qualities.

*/


public class VehicleApp {
    public static void main(String[] args) {

        // Instantiated array to store vehicles
        Vehicle[] vehicles = new Vehicle[5];

        // Initialing the array with different Car and Truck objects
        vehicles[0] = new Car("Toyota", "Corolla", 2020, 4);
        vehicles[1] = new Car("KIA", "Super", 2023, 2);
        vehicles[2] = new Truck("Ford" ,"F-300", 2024, 3);
        vehicles[3] = new Truck("Toyota", "Tundra", 2024, 2);
        vehicles[4] = new Car("Mustang", "1967 Shelby GT 500 Eleanor Series (Best car ever made, big bias)", 1967, 2);

        // For loop to print information for the vehicles listed in the array
        for (Vehicle vehicle :  vehicles) {
            System.out.println(vehicle); // Calls toString() method to print information
        }

        // Instantiates the scanner for user input in the for loop bellow
        Scanner scanner = new Scanner(System.in);

        // for loop to iterate through each vehicle in the array providing user functionality
        for (Vehicle vehicle : vehicles) {
            System.out.println("\nCar being discussed: " + vehicle.getMake() + " " + vehicle.getModel());
            System.out.print("How many miles have you traveled in this vehicle?: ");
            double distance = scanner.nextDouble(); // User input for distance traveled
            System.out.print("How many gallons did it take you?: ");
            double fuelUsed = scanner.nextDouble(); // User input for fuel used
            vehicle.calculateFuelEfficiency(distance, fuelUsed); // Takes user input for new state

            vehicle.modifyVehicleState(); // Calls the overridden method
        }
        scanner.close(); // Closes the scanner
    }
}