public class ExplicitDataTypeConversion {
    public static void main(String[] args){

        double a = 50.50;
        System.out.println("double: " + a);

        float f = (float) a;
        System.out.println("float: " + f);

        long b = (long) a;
        System.out.println("long: " + b);

        int c = (int) b;
        System.out.println("int: " + c);
    }
}
