// Java program demonstrating classes and objects

// Person class definition
class Person{
    String name; // Person's name
    int age;     // Person's age

    // Method to make the person speak
    void speak(){
        System.out.println("hello");
        System.out.println("The name is "+ name);
        System.out.println(name + " is " + age + " years old. " ); //Hint: String concatenation
    }

    // Method to calculate year of birth
    int bodcalc(){
        int bod = 2025 - age ; //Hint: Year of birth calculation
        System.out.println(name + " was born in " + bod + " A.D");
        return bod;
    }

    // Getter method for age
    int getAge(){
        return age;
    }

    // Getter method for name
    String getName(){
        return name;
    }
}

// Main class
public class ClasssesAndObjects {
    public static void main(String[] args) {
        // Create a Person object
        Person p1 = new Person();
        p1.name = "ducko";
        p1.age=34;

        // Create another Person object
        Person p2=new Person();
        p2.name="daf";
        p2.age=24;

        System.out.println(p1.name + " " + p1.age);
        p1.speak();
        p2.speak();
        p1.bodcalc();
        p2.bodcalc();
        int b0d = p1.bodcalc(); //Hint: Storing return value
        System.out.println(b0d);
        int age = p2.getAge(); //Hint: Using getter method
        System.out.println(age);
        String name = p1.getName(); //Hint: Using getter method
        System.out.println(name);
    }
}
