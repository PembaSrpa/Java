package Interfaces;

public class Person implements Info { //Hint: Implementing Info interface
    private int id = 8;
    private String name;

    public Person(String name){
        this.name = name;
    }

    public void Hello(){
        System.out.println("Person said Hello. My id is : " + id +" My name is : "+ name);
    }

    public void showinfo(){ //Hint: Implementing showinfo method from Info interface
        System.out.println("Name: "+ name + "\n Id: "+ id);
    }
}
