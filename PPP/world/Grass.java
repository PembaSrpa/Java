package PPP.world;
import PPP2.world2.Plant;
public class Grass extends Plant{
    public Grass(){
        //wont work -- grass is not in the same package as plant even though its subclass
        //System.out.println(this.height);
    }
}
