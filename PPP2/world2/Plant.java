package PPP2.world2;
class Tree{
    //its like private for class
}
public class Plant {
    //Bad practice
    public String name;
    //Acceptable practice --- Its final
    public final static int ID = 7;
    private String type;
    protected String size;
    int height;
    public Plant(){
        this.name = " Fred";
        this.type = " plant";
        this.size = "small";
        this.height = 9;
        System.out.println(this.type);
    }

}
