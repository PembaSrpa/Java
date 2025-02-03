public class NumericalValues {
    public static void main(String[] args) {
        byte bval = 20;
        short sval = 555; 
        int ival = 888;
        long lval = 2314;

        float fval = 123.23f;
        double dval= 21375145.2;

        System.out.println(Byte.MAX_VALUE);

        ival=(int)lval;
        System.out.println(ival);

        dval=ival;
        System.out.println(dval);

        ival=(int)fval;
        System.out.println(ival);

        bval=(byte)sval;
        System.out.println(bval);
        // (555-128-128-128-128)
}

}