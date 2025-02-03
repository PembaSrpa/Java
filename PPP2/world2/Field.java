package PPP2.world2;

public class Field {
    private Plant plant = new Plant();
    public Field(){
        //size is protected; field is in the same package as plant
        System.out.println(plant.size);
    }
}
