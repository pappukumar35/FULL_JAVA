package Condition;

public class Ternery {
    public static void main(String args[]) {
        int number = 10;

        // ternery operator
        String type = ((number % 2) == 0) ? "even" : "odd";
        System.out.println(type);
    }
}
