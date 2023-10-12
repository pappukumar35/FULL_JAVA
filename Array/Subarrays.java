package Array;

import java.util.Scanner;

public class Subarrays {

    public static void printSubarrays(int numbers[]) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + "");
                }
                ts++;
                System.out.println();

            }
            System.out.println();

        }
        System.out.println("total subarrays=" + numbers);
    }

    public static void main(String args[]) {

        int number[] = { 2, 4, 6, 8, 10, 12, 14 };
        printSubarrays(number);
    }
}