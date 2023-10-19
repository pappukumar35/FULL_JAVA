package Array;

public class Sprial_matrix {

    public static void printsprial(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

        }
        // right
        for (int i = startRow; i <= endRow; i++) {
            System.out.print(matrix[i][startCol]);
        }
        // bottom
        for (int j = endCol - 1; j >= startCol; j--) {
            System.out.print(matrix[endRow][j] + " ");
            if (startCol == endCol) {
                break;
            }
        }
        // left
        for (int i = endRow - 1; i >= endRow + 1; i--) {
            System.out.print(matrix[i][startRow]);
            if (startCol == endCol) {
                break;
            }

        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        printsprial(matrix);
    }

}