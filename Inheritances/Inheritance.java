package Inheritances;

public class Inheritance {
    public static void main(String[] args) {
        // Create a Machine object.
        Machine m1 = new Machine(); //Hint: Creating a Machine object

        // Start and stop the machine.
        m1.start(); //Hint: Calling start method
        m1.stop();  //Hint: Calling stop method

        // Create a Car object.  Note that Car inherits from Machine.
        Car c1 = new Car(); //Hint: Creating a Car object. Note that Car inherits from Machine.

        // Start the car, make it sound, and then stop it.  The start and stop methods are inherited from Machine.
        c1.start(); //Hint: Calling start method (inherited from Machine)
        c1.sound(); //Hint: Calling sound method (specific to Car)
        c1.stop();  //Hint: Calling stop method (inherited from Machine)
    }
}
