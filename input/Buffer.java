package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Buffer {
    public static void main(String args[]) throws NumberFormatException, IOException {
        // scanner sc=new scanner(System.in);
        System.out.println("Enter a number");
        // InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());// 45
        System.out.println(n);
    }

}
