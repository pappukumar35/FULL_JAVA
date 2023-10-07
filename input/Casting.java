package input;

import java.util.Scanner;

public class Casting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        float a = 25.100000f;
        int b = (int) a;
        System.out.println(b);

        // float marks = 99.999f;
        // int number2 = (int)number2;
        // System.out.println(number2);

        char ch = 'a';
        char ch2 = 'b';
        int number = ch;
        int number2 = ch2;
        System.out.println(number);
        System.out.println(number2);

    }
}
