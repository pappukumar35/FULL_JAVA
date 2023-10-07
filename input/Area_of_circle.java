package input;

import java.util.Scanner;

public class Area_of_circle {
    public static void main(String args[]) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the circle: ");

        // Read the radius from the user
        float rad = sc.nextFloat();

        // Calculate the area of the circle
        float area = 3.14f * rad * rad;

        // Display the calculated area
        System.out.println("The area of the circle is: " + area);

        // Close the Scanner
        sc.close();
    }
}
