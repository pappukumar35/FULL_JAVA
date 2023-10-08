package Function;

import java.util.Scanner;

public class Binomial_Coefficient {

    public static int factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int binomialCalculate(int numberN, int numberR) {
        int factorialN = factorial(numberN);
        int factorialR = factorial(numberR);
        int factorialNR = factorial(numberN - numberR);

        int binomialCoefficient = factorialN / (factorialR * factorialNR);

        return binomialCoefficient;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number N =");
        int numberN = sc.nextInt();
        System.out.println("Enter your number R (must be less than or equal to N) =");
        int numberR = sc.nextInt();

        if (numberR <= numberN) {
            int result = binomialCalculate(numberN, numberR);
            System.out.println("Binomial Coefficient (N choose R) = " + result);
        } else {
            System.out.println("R must be less than or equal to N.");
        }
    }
}
