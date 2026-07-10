import java.util.Scanner;

public class Day14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter the matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean isIdentity = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    if (matrix[i][j] != 1) {
                        isIdentity = false;
                        break;
                    }
                } else {
                    if (matrix[i][j] != 0) {
                        isIdentity = false;
                        break;
                    }
                }
            }

            if (!isIdentity)
                break;
        }

        if (isIdentity)
            System.out.println("Identity Matrix");
        else
            System.out.println("Not an Identity Matrix");

        sc.close();
    }
}