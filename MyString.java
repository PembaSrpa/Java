// Java program demonstrating String manipulation and StringBuilder

import java.io.File;
import java.io.FileNotFoundException; 
import java.util.Scanner;

class Frog {
    private String name; // Instance variable to store the frog's name.
    private int id;     // Instance variable to store the frog's ID.

    // Constructor for Frog objects.
    public Frog(int id, String name){
        this.name = name; // Sets the frog's name.
        this.id = id;     // Sets the frog's ID.
    }

    // Overrides the toString method to provide a custom string representation of the Frog object.
    public String toString(){ //Hint: Overriding toString method
        StringBuilder ab = new StringBuilder(); // Creates a StringBuilder object.
        ab.append(id).append(": "); // Appends the frog's ID followed by a colon and a space.
        ab.append(name);           // Appends the frog's name.
        return ab.toString();      // Returns the resulting string.
    }
}

public class MyString {
    public static void main(String[] args) {
        String info = ""; // Initialize an empty String.
        info += "I am Bob. "; // Append "I am Bob. " to info.
        info += "";           // Append an empty String to info (no effect).
        info += "The Builder."; // Append "The Builder." to info.
        System.out.println(info); // Prints the concatenated string.

        // Use StringBuilder to efficiently build a string.
        StringBuilder ab = new StringBuilder(""); // Creates a StringBuilder object.
        ab.append("I am Duck."); // Appends "I am Duck." to ab.
        ab.append(" ")           // Appends a space to ab.
        .append("Duckkkkk");     // Appends "Duckkkkk" to ab.
        System.out.println(ab.toString()); // Prints the string built by StringBuilder. //Hint: Using StringBuilder

        // Demonstrate escape sequences.
        System.out.print("Some text \ttab \nnewline\n"); // Prints "Some text" followed by a tab, newline, and another newline.
        System.out.println("more text"); // Prints "more text" on a new line.

        int a = 340; // Initialize an integer variable a to 340.

        // Demonstrate formatted output using printf.
        System.out.printf("Number : %d , another : %-2d \n", 5, a); // Prints "Number : 5 , another : 340 ".  //Hint: Format specifiers
        System.out.printf("Another number : %.3f \n", 3.465831); // Prints "Another number : 3.466 ".
        System.out.printf("%4.2f \n", 234.56745); // Prints "234.57 ".

        // Create a Frog object and print its string representation.
        Frog f1 = new Frog(7, "Fred"); // Creates a Frog object.
        System.out.println(f1);       // Prints the string representation of the Frog object. //Hint: Using toString() implicitly
    
        String filename = "C:\\Users\\Niras\\Desktop\\Java\\Example.txt";
        File textFile = new File(filename);
        try (Scanner in = new Scanner(textFile)) { // Use try-with-resources to ensure Scanner is closed
            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filename);
        }
    }
}
