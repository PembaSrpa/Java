public class Loops {
    public static void main(String[] args) {
        int val = 1; // Initialize val to 1

        // While loop that continues as long as val is less than 10.
        while (val < 10) {
            System.out.println("hello"); // Prints "hello"
            val = val + 1; // Increments val by 1 in each iteration. //Hint: Incrementing val
        }

        // For loop that iterates 5 times.
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello"); // Prints "Hello"
            System.out.printf("the value of i is : %d \n", i); // Prints the value of i. //Hint: Using printf for formatted output
        }
    }
}
