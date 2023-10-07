package Pattern;

public class patt3 {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; i < n; j++) {
                if (j == 0 || j == n - 1 || i == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print("");
                }
                System.out.println();
            }
        }
    }
}
