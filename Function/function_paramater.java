package Function;

public class function_paramater {

    // function call 2 integer value
    public static int sum(int a, int b) {
        return a + b;
    }

    // function call 3 integer value
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]) {
        System.out.println(sum(2, 3));
        System.out.println(sum(2, 3, 4));

    }

}