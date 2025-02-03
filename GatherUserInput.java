import java.util.Scanner;

public class GatherUserInput {
    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a line of text :  "); // Prompts the user to enter a line of text.
        String line = in.nextLine(); // Reads the entire line of text entered by the user.
        System.out.println("You entered : " + line); // Prints the line of text entered by the user.

        System.out.println("Enter an integer: "); // Prompts the user to enter an integer.
        int val = in.nextInt(); // Reads the integer entered by the user.  //Hint: nextInt() reads only the integer, leaving the newline character.
        System.out.println("You entered: " + val); // Prints the integer entered by the user.
        in.close(); // Closes the scanner to release resources. //Hint: Close scanner to prevent resource leaks
    }
}
