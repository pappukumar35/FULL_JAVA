package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name;

        try {
            System.out.println("Enter your name: ");
            name = br.readLine(); // Read a line of text from the user

            System.out.println("Name: " + name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
