package Condition;

import java.util.Scanner;

public class odd_even {
    /**
     * @param args
     */
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        if(number %2==0){
            System.out.println("EVEN");

        }
        else{
            System.out.println("odd");
        }
    }
}
