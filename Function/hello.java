package Function;

import java.util.Scanner;

public class hello {
    public static int printhello() {
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        return 10;
    }

    public static void calculateSum(int a, int b) {
        int sum = a + b;
        System.out.println("sum is : " + sum);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        calculateSum(a, b);

    }
}
