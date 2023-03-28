public class ComparisonOperator {
    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;

        //if value1 is equal to value2
        if (value1 == value2)
            System.out.println("value1 == value2");
        //if value1 is not equal to value2
        if (value1 != value2)
            System.out.println("value1 != value2");
        //if value1 is greater than value2
        if (value1 > value2)
            System.out.println("value1 > value2");
        //if value2 is greater than value1
        if (value1 < value2)
            System.out.println("value1 < value2");
        //if value1 is greater than or equal to value2
        if (value1 <= value2)
            System.out.println("value1 <= value2");

        if((value1 == 1) && (value2 == 2))
            System.out.println("value1 is 1 AND value2 is 2");
        if((value1 == 1) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1");
    }
}
