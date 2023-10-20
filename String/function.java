package String;

public class function {
    public static void main(String[] args) {
        String s1 = "pappu";
        String s2 = "pappu";
        String s3 = new String("pappu");
        if (s1 == s2) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");
        }
        if (s1 == s3) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");
        }
        if (s1.equals(s3)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
