public class Text {
    public static void main(String[] args){
        int myint = 7; // Initialize myint to 7
        String text = "Hello"; // Initialize text to "Hello"
        String blank = " "; // Initialize blank to a space
        String name = "Duck"; // Initialize name to "Duck"

        // Concatenate strings to create a greeting.
        String greet = text + blank + name ; //Hint: String concatenation
        System.out.println(greet); // Prints the greeting

        System.out.println("Hello" + " " + "Bob"); // Prints "Hello Bob"
        System.out.println("My integer is : " + myint); // Prints "My integer is : 7" //Hint: Concatenating String and int
    }
}
