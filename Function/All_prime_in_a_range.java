package Function;

public class All_prime_in_a_range {

    public static boolean isprime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");

            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primesInRange(100);
    }

    static int getpath(String path) {

    }
}
