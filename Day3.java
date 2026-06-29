import java.util.Scanner;

public class Day3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter key to search: ");
        int k = sc.nextInt();

        int comparisons = 0;
        boolean found = false;

        for (int i = 0; i < n; i++) {

            comparisons++;

            if (arr[i] == k) {
                System.out.println("Found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not Found");
        }

        System.out.println("Comparisons = " + comparisons);

        sc.close();
    }
}