package Pattern;

public class T {
    public static void main(String args[]) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == (n - 1) / 2) {
                    System.out.print("*");

                } else {
                    System.out.print("");
                }
            }
            System.out.println();
        }

    }
}
