import java.util.Scanner;

public class Day01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n + 1];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter position: ");
        int pos = sc.nextInt();

        System.out.print("Enter element to insert: ");
        int x = sc.nextInt();

        for (int i = n; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos - 1] = x;

        System.out.println("\nUpdated Array:");
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}