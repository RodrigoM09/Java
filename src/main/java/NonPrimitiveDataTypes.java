import java.util.Arrays;

public class NonPrimitiveDataTypes {
    public static void main(String[] args){
        String str = "Hello World!";
        System.out.println("String: " + str);

        String str1 = new String("Hello World!");
        System.out.println("Another String: " + str1);

        int[] arr;
        arr = new int[2];
        arr[1] = 1;
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Array: " + arr[0]);

    }
}
