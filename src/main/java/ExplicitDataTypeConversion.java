public class ExplicitDataTypeConversion {
    public static void main(String[] args){

        double a = 50.50;
        System.out.println("double: " + a);

        //Type casting, is a way to convert one data type to another.
        float f = (float) a;
        System.out.println("float: " + f);

        long b = (long) a;
        System.out.println("long: " + b);

        int c = (int) b;
        System.out.println("int: " + c);
    }
}
