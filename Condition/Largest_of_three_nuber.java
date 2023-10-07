package Condition;

public class Largest_of_three_nuber {
    public static void main(String args[]) {
        int A = 1;
        int B = 3;
        int C = 6;
        if ((A >= B) && (A >= C)) {
            System.out.println("Largest is A");
        } else if (B >= C) {
            System.out.println("Largest is B");

        } else {
            System.out.println("Largest is C");
        }
    }
}
