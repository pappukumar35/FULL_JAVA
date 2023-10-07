package Loop;

import java.util.Scanner;

public class Display_all_number_entered_by_user_except_multiples_of_10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter your number:");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                continue;
            }
            System.out.println("number was:" + n);

        } while (true);

    }
}
