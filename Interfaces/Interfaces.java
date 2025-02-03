package Interfaces;

// This example demonstrates the use of interfaces in Java.
public class Interfaces {
    public static void main(String[] args) {
        // Create a Person object.
        Person p1 = new Person("Ram"); //Hint: Creating a Person object

        // Call the Hello method on the Person object.
        p1.Hello(); //Hint: Calling Hello method

        // Create a Dog object (which implements Animal).
        Animal a1 = new Dog(); //Hint: Creating a Dog object (which implements Animal)

        // Call the sound method on the Dog object.
        a1.sound(); //Hint: Calling sound method (from Animal interface)

        // Create an Info object.
        Info i1 = new Person("Sam"); //Hint: Creating a Person object (which implements Info)

        // Call the showinfo method on the Info object.
        i1.showinfo(); //Hint: Calling showinfo method (from Info interface)

        Output(p1);
        Output(i1);

    }
    public static void Output(Info info) {
        info.showinfo();
    }
}
