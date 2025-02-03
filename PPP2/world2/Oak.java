package PPP2.world2;

public class Oak extends Plant{
    public Oak(){
        //wont work -- type is private
        // type = "tree";
        // this works -- size is protected, Oak is subclass of Plant
        this.size="large";
    }   
}
