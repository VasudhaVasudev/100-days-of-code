import java.util.Scanner;

public class Day06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " sorted elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n == 0) {
            System.out.println("Array is empty.");
            sc.close();
            return;
        }

        int j = 0;

        for (int i = 1; i < n; i++) {

            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }

        }

        System.out.println("\nUnique Elements:");

        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}