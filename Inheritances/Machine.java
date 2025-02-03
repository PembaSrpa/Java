package Inheritances;

public class Machine {
    private String name = " Mach 1"; // Instance variable to store the machine's name, initialized to "Mach 1".  This is private, so it cannot be directly accessed from subclasses. //Hint: Private instance variable

    // Method to start the machine.
    public void start(){ //Hint: Public method to start the machine
        System.out.println("Machine Started"); // Prints "Machine Started" to the console.
    }

    // Method to stop the machine.
    public void stop(){ //Hint: Public method to stop the machine
        System.out.println("Machine Stopppeds"); // Prints "Machine Stopppeds" to the console.  Note the typo here.
    }

    // Method to show the machine's name.
    public void show(){ //Hint: Public method to display the machine's name
        System.out.println(name); // Prints the machine's name to the console.
    }
}
