package Function;

import java.util.Scanner;

public class Factorial_of_a_number_n {

    public static void main(String args[]) {
        int n, fact = 1;
        System.out.print("Enter your any number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            fact = fact + i;
        }
        System.out.println("factorial=" + fact);

    }
}
