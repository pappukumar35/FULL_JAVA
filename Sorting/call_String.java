package Sorting;

public class call_String {

    public static void printLetter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + "");
        }
        System.out.println();
    }

    private static String extracted() {
        return " ";
    }

    public static void main(String args[]) {
        String firstname = "pappu";
        String lastname = "kumar";
        String fullname = firstname + extracted() + lastname;
        System.out.println(fullname.charAt(0));
        printLetter(fullname);
    }
}
