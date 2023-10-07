package input;

import java.util.*;
import java.util.Scanner;

public class name {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        String name;
        int rollno;
        float marks;
        System.out.println("Enter your name");
        name = obj.nextLine();
        System.out.println("Enter your rollno");
        rollno = obj.nextInt();
        System.out.println("Enter your marks");
        marks = obj.nextFloat();
        System.out.println("Name=" + name);
        System.out.println("Rollno= " + rollno);
        System.out.println("Marks=" + marks);

    }

}
