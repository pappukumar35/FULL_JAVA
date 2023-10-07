package input;

import java.util.Scanner;

public class Second {
    /**
     * @param args
     */
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        int number = sc.nextInt();
        System.out.println(number);
        float price = sc.nextFloat();
        System.out.println(price);
        boolean var = sc.nextBoolean();
        System.out.println(false);
        short s = sc.nextShort();
        System.out.println(s);
        long l = sc.nextLong();
        System.out.println(l);

    }
}
