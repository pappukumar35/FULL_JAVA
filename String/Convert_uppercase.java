package String;

public class Convert_uppercase {

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = character.touppercase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
            }

        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String str = "pappu kumar jainajar";
        System.out.println(str);
    }

}
