package Function;

public class number_is_prime_or_not2 {

    public static boolean isprime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;

            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isprime(16));
    }

}
