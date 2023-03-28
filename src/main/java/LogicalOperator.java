public class LogicalOperator {
    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;

        //if value1 is equal to 1 AND value2 is equal to 2
        if ((value1 == 1) && (value2 == 2))
            System.out.println("value1 is 1 AND value2 is 2");

        //if value1 is equal to 1 OR value2 is equal to 1
        if ((value1 == 1) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1");

        //Ternary operator &&
        int result = (value1 == 1) && (value2 == 2) ? value1 : value2;
        System.out.println(result);
        //Ternary operator ||
        int result2 = (value1 == 1) || (value2 == 2) ? value1 : value2;
        System.out.println(result2);

    }
}
