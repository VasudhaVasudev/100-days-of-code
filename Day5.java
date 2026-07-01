import java.util.Scanner;

public class Day5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in first array: ");
        int p = sc.nextInt();

        int[] arr1 = new int[p];

        System.out.println("Enter " + p + " sorted elements:");

        for (int i = 0; i < p; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter number of elements in second array: ");
        int q = sc.nextInt();

        int[] arr2 = new int[q];

        System.out.println("Enter " + q + " sorted elements:");

        for (int i = 0; i < q; i++) {
            arr2[i] = sc.nextInt();
        }

        int i = 0, j = 0;

        System.out.println("\nMerged Array:");

        while (i < p && j < q) {

            if (arr1[i] <= arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            } else {
                System.out.print(arr2[j] + " ");
                j++;
            }
        }

        while (i < p) {
            System.out.print(arr1[i] + " ");
            i++;
        }

        while (j < q) {
            System.out.print(arr2[j] + " ");
            j++;
        }

        sc.close();
    }
}