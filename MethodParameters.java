// Java program demonstrating methods with parameters

class Robot {
    private int roll; // Instance variable to store the robot's roll value.

    // Method to make the robot speak "Hello".
    public void speak() {
        System.out.println("Hello"); // Prints "Hello" to the console.
    }

    // Method to make the robot speak a given text.
    public void speak2(String text) { //Hint: Method with String parameter
        System.out.println(text); // Prints the given text to the console.
    }

    // Method to simulate the robot moving a given distance in a given direction.
    public void move(String dir, double dist) { //Hint: Method with String and double parameters
        System.out.println("Moving " + dist + " metres in direction " + dir); // Prints a message indicating the robot's movement.
    }

    // Method to set the robot's roll value. Returns the new roll value.
    public int setroll(int roll) { //Hint: Method with int parameter and int return type
        this.roll = roll; // Sets the robot's roll value to the given value.
        return this.roll; // Returns the new roll value.
    }
}

public class MethodParameters {
    public static void main(String[] args) {
        // Create a Robot object named b2.
        Robot b2 = new Robot();

        // Make b2 speak "Hello".
        b2.speak();

        // Make b2 speak "Hello i am b2".
        b2.speak2("Hello i am b2");

        // Make b2 move 32 meters North.
        b2.move("North", 32);

        // Create another Robot object named b4.
        Robot b4 = new Robot();

        // Define a string variable.
        String txt = "umumumu";

        // Make b4 speak the contents of the txt variable.
        b4.speak2(txt);

        // Set b2's roll value to 56.
        b2.setroll(56); //Hint: Calling setroll method
    }
}
