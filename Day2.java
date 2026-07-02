//javac D"Day 2 - Array Deletion"
import java.util.Scanner;

public class Day2 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter position to delete : ");
        int pos = sc.nextInt();

        if (pos < 1 || pos > n) {
            System.out.println("Invalid Position!");
            return ;
        }

        for (int i = pos - 1; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println("\nUpdated Array:");

        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}