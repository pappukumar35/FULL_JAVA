package Loop;

import java.util.Scanner;

public class print_number_from_1_to_n {
    public static void main(String args[], Scanner sc) {
        Scanner rc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;
        while (counter <= range) {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();

    }
}
