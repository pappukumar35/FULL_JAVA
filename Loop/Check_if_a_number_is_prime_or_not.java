package Loop;

import java.util.Scanner;

public class Check_if_a_number_is_prime_or_not {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 2) {
            System.out.println("n is prime");
        }

        boolean isprime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isprime = false;
            }
        }

        if (isprime == true) {
            System.out.println("n is prime");
        } else {
            System.out.println("n is not prime");
        }

    }
}
