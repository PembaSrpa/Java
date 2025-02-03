package Polymorphism;

public class App {
    public static void main(String[] args) {
        Plant p1 = new Plant();
        Tree t1 = new Tree();
        Plant p2= t1 ;
        p1.grow();
        t1.grow();
        p2.grow();
        //p2.shed();
        dogrow(t1);
    }
    public static void dogrow(Plant plant) {
        plant.grow();
    }
}
