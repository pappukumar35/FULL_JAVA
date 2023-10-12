package Array;

public class Smallest_number {

    public static int Smallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i > numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
                System.out.println("smallest is :" + Smallest(numbers));

            }

        }
        return smallest;
    }

    public static void main(String[] args) {

        int number[] = { 2, 4, 6, 8, 10, 12, 14 };
        System.out.println("smallest is :" + Smallest(number));

    }
}
