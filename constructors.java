// Java program demonstrating constructors and using instance variables

// Machine class definition
class Machine{
    private String name; // Instance variable to store the machine's name.
    private int code;   // Instance variable to store the machine's code.

    // Default constructor.
    public Machine(){
        System.out.println("Constructor running"); // Prints "Constructor running" to the console.
        name = "armbot"; // Sets the machine's name to "armbot".
    }

    // Constructor that takes a String argument for the machine's name.
    public Machine(String name){
        this("neckbot",9); // Calls the three-argument constructor with default values. //Hint: Constructor chaining
        System.out.println("Second constructor running"); // Prints "Second constructor running" to the console.
        this.name = name; // Sets the machine's name to the given value.
    }

    // Constructor that takes a String argument for the machine's name and an int argument for the machine's code.
    public Machine(String name, int code){ //Hint: Constructor with multiple parameters
        System.out.println("Third constructor running"); // Prints "Third constructor running" to the console.
        this.name = name; // Sets the machine's name to the given value.
        this.code = code; // Sets the machine's code to the given value.
    }

    // Method to print machine details
    public void printDetails(){
        System.out.println("Machine Name: " + name + ", Code: " + code);
    }
}

// Main class
public class constructors {
    public static void main(String[] args) {
        // Create Machine objects using different constructors.
        Machine m1 = new Machine(); // Creates a Machine object using the default constructor.
        Machine m2 = new Machine("legbot"); // Creates a Machine object using the constructor that takes a String argument.
        Machine m3 = new Machine("headbot", 7); // Creates a Machine object using the constructor that takes a String and an int argument. //Hint: Calling different constructors

        // Print machine details
        m1.printDetails();
        m2.printDetails();
        m3.printDetails();
    }
}
