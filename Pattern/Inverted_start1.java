package Pattern;

public class Inverted_start1 {
    public static void main(String args[]) {
        // for (int line = 1; line <= 4; line++) {
        // for (int start = 4; start <= line; start++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        int n = 4;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
