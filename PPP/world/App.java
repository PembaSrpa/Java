package PPP.world;
import PPP2.world2.Plant;
public class App {
    public static void main(String[] args) {
        Plant plant = new Plant();
        System.out.println(plant.name);
        System.out.println(Plant.ID);
        // wont work -- type is private
        // sysout(plant.type);
        //wont work -- size is protected; App is not in same package as plant
        //System.out.println(plant.size);
        //wont work -- app and plant in different packages, height has package-level visibility
        //System.out.println(plant.height);
    }
}
