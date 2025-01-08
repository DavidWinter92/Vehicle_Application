
# Vehicle Application

This application is designed to demonstrate the use of polymorphism and catch handling exceptions.

## Authors

- David Winter
- Software Development 1
- CEN 3024C

## Description

This program will take user input to change the values of various vehicle types.

Programming concepts demonstrated in this project are inheritance, polymorphism, and abstraction.

This program will will make use of an array and for loop to change the attributes of 5 different vehicles and perform calculations based on their unique qualities.

## Documentation

class:

- VehicleApp
- Car
- Truck
- Vehicle

interface:

- VehicleActions

VehicleApp is the main class that will run the application and instantiate other classes for functionality. 

Car class and Truck class extends the Vehicle class to provide unique behaviors for each type.

Vehicle class acts as an abstract class that will implement the VehicleActions interface and serve as a base for various car types.

VehicleActions is an interface that defines the methods to be implemented by various vehicle class types for concistency.

Further documentation provided in .java code files.

## Expected Functionailty

When running the program use the VehicleApp main class.

The console should list 5 viehicles with various specifications and predefined attributes.

The initial prompt will inform you of the car being discussed.

You will be prompted to enter the miles traveled.

You will then be promted to enter the amount of fuel used.

At this time the console will inform you of the vehicles fuel efficiency.

Finally, you will be promtped to decide the state of the vehicle (on or off).

It will update the vehicles state and provide verification.

This process repeats until all vehicles in the array have been iterrated through.

## Example Input Output

Vehicle [make = Toyota, model = Corolla, year = 2020], Car [numberOfDoors= 4]
Vehicle [make = KIA, model = Super, year = 2023], Car [numberOfDoors= 2]
Vehicle [make = Ford, model = F-300, year = 2024], Truck [weightCapacity=3.0 tons]
Vehicle [make = Toyota, model = Tundra, year = 2024], Truck [weightCapacity=2.0 tons]
Vehicle [make = Mustang, model = 1967 Shelby GT 500 Eleanor Series (Best car ever made, big bias), year = 1967], Car [numberOfDoors= 2]

Car being discussed: Toyota Corolla
How many miles have you traveled in this vehicle?: 5
How many gallons did it take you?: 5
your car fuel efficiency is: 1.0 mpg
Would you like your vehicle turned 'on' or 'off'?
on
Vehicle state changed to: on
Your Corolla is now  turned on