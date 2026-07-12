import java.util.Scanner;

public class Day15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        int limit = Math.min(m, n);

        for (int i = 0; i < limit; i++) {
            sum += matrix[i][i];
        }

        System.out.println("Sum of Primary Diagonal = " + sum);

        sc.close();
    }
}