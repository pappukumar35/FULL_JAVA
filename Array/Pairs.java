package Array;

public class Pairs {

    public static void PrintPairs(int numbers[]) {
        String tp;
        for (int i = 0; i < numbers.length - 1; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + " )");
                // tp++;

            }
            System.out.println();

        }
        // System.out.println("total pairs =" + tp);

    }

    public static void main(String args[]) {

        int numbres[] = { 2, 4, 6, 8, 10, 12, 14 };
        PrintPairs(numbres);
    }
}
