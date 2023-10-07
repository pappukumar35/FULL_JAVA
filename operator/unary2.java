package operator;

public class unary2 {
    public static void main(String args[]) {
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        int x = 100;
        int y = x++;
        System.out.println(x);
        System.out.println(y);
        // decrement operator pre decrement
        int q = 12;
        int w = --q;
        System.out.println(q);
        System.out.println(w);

        // post decrement operator
        int s = 11;
        int t = s--;
        System.out.println(s);
        System.out.println(t);

    }
}
