package Inheritances;

// Car class extending the Machine class.
public class Car extends Machine {
    // Override the stop method from the Machine class.  This demonstrates polymorphism.
    public void stop(){ //Hint: Overriding stop method. This demonstrates polymorphism.
        System.out.println("Car Stopped"); // Prints "Car Stopped" to the console.
    }

    // Method to simulate the car making a sound.
    public void sound(){ //Hint: Method specific to Car class
        System.out.println("Vroom Vroom"); // Prints "Vroom Vroom" to the console.
    }
}
