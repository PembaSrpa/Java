import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        int val = 0; // Initialize val to 0

        // Do-while loop that continues until the user enters 5.
        do{
            System.out.println("Enter a number : "); // Prompts the user to enter a number.

            val = scanner.nextInt(); // Reads the user's input.
        }
        while(val != 5); // Condition to check if the entered number is not equal to 5.

        System.out.println("Got 5"); // Prints "Got 5" when the loop terminates.
        scanner.close(); // Closes the scanner to release resources. //Hint: Close scanner to prevent resource leaks
    }
}
