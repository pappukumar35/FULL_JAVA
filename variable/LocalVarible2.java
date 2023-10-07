package variable;

public class LocalVarible2 {
    public static void main(String args[]) {
        int x = 10;
        String message = "Hello , World";
        System.out.println("x=" + x);
        System.out.println("message =" + message);
        if (x > 5) {
            String result = " x is the greater than 5";
            System.out.println("result");

        }
        for (int i = 0; i < 10; i++) {
            String loopMessage = "Iteration" + i;
            System.out.println(loopMessage);
        }
    }
}
