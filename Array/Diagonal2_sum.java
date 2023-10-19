package Array;

public class Diagonal2_sum {
    public static void diagonalsum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // pd
            sum += matrix[i][i];
            // sd
            if (i != matrix.length - 1) {
                sum += matrix[i][matrix.length - i - 1];
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4, }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        Diagonalsum(matrix);

    }
}
