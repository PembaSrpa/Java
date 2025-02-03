// Java program demonstrating static members

// Thing class definition
class Thing{
    // Static constant
    public final static int CONST = 7; //Hint: Static constant

    // Static variable to keep track of the number of Thing objects created.
    public static int count = 0; //Hint: Static variable

    // Instance variables
    public int id;     // Instance variable to store the object's ID.
    public String name; // Instance variable to store the object's name.

    // Static variable to store a description of Thing objects.
    public static String desc; //Hint: Static variable

    // Constructor for Thing objects.
    public Thing(){
        id = count; // Sets the object's ID to the current value of count.
        count++;   // Increments count to prepare for the next object.
    }

    // Method to display the object's name and description.
    public void showname(){
        System.out.println("Object Id " + id + " , " + desc + " " +name); // Prints the object's ID, description, and name.
    }

    // Static method to display the description of Thing objects.
    public static void showInfo(){ //Hint: Static method
        System.out.println(desc); // Prints the description.
        // System.out.println(name); // This would not work because 'name' is an instance variable, not a static variable.
    }
}

// Main class
public class Static {
    public static void main(String[] args) {
        // Set the description for Thing objects.
        Thing.desc = "I am a thing"; //Hint: Accessing static variable

        // Call the static showInfo method to display the description.
        Thing.showInfo(); //Hint: Calling static method

        System.out.println(Thing.count + " Before "); // Prints the initial value of count.

        // Create two Thing objects.
        Thing t1 = new Thing();
        Thing t2 = new Thing();

        // Set the names of the Thing objects.
        t1.name = "Bed";
        t2.name = "Ted";

        // Call the showname method for each Thing object to display its details.
        t1.showname();
        t2.showname();

        System.out.println(Thing.count + " After "); // Prints the value of count after creating two objects.

        System.out.println(Math.PI); // Prints the value of PI from the Math class.
        System.out.println(Thing.CONST); // Prints the value of CONST from the Thing class. //Hint: Accessing static constant
    }
}
