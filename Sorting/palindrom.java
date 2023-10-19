package Sorting;

public class palindrom {

    public static boolean ispalindrom(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        String str = "noon";
        System.out.println(ispalindrom(str));
    }
}
