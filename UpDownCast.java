class Drinks{
    public void start(){
        System.out.println("Wataaaar");
    }
}
class Coke extends Drinks{
    public void start(){
        System.out.println("Cokee");
    }
    public void stop(){
        System.out.println("No coke");
    }
}
public class UpDownCast {
    public static void main(String[] args) {
        Drinks d1=new Drinks();
        Coke c1= new Coke();
    
        d1.start();
        c1.start();
        c1.stop();

        //Upcasting
        Drinks d2 = c1;
        d2.start();
        // m2.stop(); cant...

        //Downcasting -- unsafe
        Drinks d3 = new Coke();
        Coke c2 = (Coke) d3;
        c2.start();
        c2.stop();
    }
}
