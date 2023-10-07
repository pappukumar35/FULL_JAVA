package operator;

public class logic {
    public static void main(String args[]) {
        int p = 10;
        int q = 20;
        int r = 15;
        System.out.println((p > q) && (p > r));
        System.out.println((p > q) && (p < r));
        // || operator
        System.out.println((r < p) || (p < q));
        System.out.println((p > q) || (p > r));
        // ! operator
        System.out.println(!(p == q));
        System.out.println(!(p > q));
        System.out.println(!(p < q));
        System.out.println(!(p > r));
        System.out.println(!(r < p));
        System.out.println(!(r < q));
    }
}
