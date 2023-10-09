package Function;

public class function_data_type {

    // function call 2 integer value
    public static int sum(int a, int b) {
        return a + b;
    }

    // function2 call 2 floating value
    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String args[]) {
        System.out.println(sum(2, 3));
        System.out.println(sum(10.5f, 50.5f));

    }

}
