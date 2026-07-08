import java.util.Scanner;

public class Day12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter elements of the matrix:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // A symmetric matrix must be square
        if (m != n) {
            System.out.println("Not a Symmetric Matrix");
            sc.close();
            return;
        }

        boolean isSymmetric = true;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }

            if (!isSymmetric)
                break;
        }

        if (isSymmetric)
            System.out.println("Symmetric Matrix");
        else
            System.out.println("Not a Symmetric Matrix");

        sc.close();
    }
}