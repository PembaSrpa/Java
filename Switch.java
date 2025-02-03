import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // Create a Scanner object to read user input.
        Scanner input = new Scanner(System.in);

        System.out.println("enter a command : "); // Prompts the user to enter a command.
        String text = input.nextLine(); // Reads the command entered by the user.

        // Switch statement to handle different commands.
        switch (text) {
            case "start": // Checks if the command is "start".
                System.out.println("Machine started"); // Prints "Machine started" if the command is "start".
                break; // Exits the switch statement.
            case "stop": // Checks if the command is "stop".
                System.out.println("Machine stopped"); // Prints "Machine stopped" if the command is "stop".
                break; // Exits the switch statement.
            default: // Executes if the command is neither "start" nor "stop".
                System.out.println("Cmd not recognized"); // Prints "Cmd not recognized" if the command is not recognized.
                break; // Exits the switch statement.
        }
        input.close(); // Closes the scanner to release resources. //Hint: Close scanner to prevent resource leaks
    }
}
