package Function;

public class product_of_a_and_b {

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String args[]) {
        int a = 10;
        int b = 12;
        int prod = multiply(a, b);
        System.out.println("a*b=" + prod);
    }

}
