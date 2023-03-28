public class ImplicitDataTypeConversion {
    public static void main(String[] args){
        int a = 100;
        System.out.println("int: " + a);
        long b = a;
        System.out.println("long: " + b);
        float c = b;
        System.out.println("float: " + c);
    }
}
