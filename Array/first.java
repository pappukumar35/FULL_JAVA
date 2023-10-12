package Array;

import java.util.Scanner;

public class first {

    public static void main(String args[]) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        /*
         * int physics;
         * phy= sc.nextInt();
         * int maths;
         * mat= sc.nextInt();
         * int java;
         * jav =sc.nextInt();
         * 
         */
        marks[0] = sc.nextInt();// py
        marks[1] = sc.nextInt();// java
        marks[2] = sc.nextInt();// c++
        System.out.println("py :" + marks[0]);
        System.out.println("java :" + marks[1]);
        System.out.println("c++ :" + marks[2]);

        marks[2] = 100;
        System.out.println("java:" + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage =" + percentage + "%");

        System.out.println("length of array=" + marks.length);

    }
}
