import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Day16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("\nElement : Frequency");

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + ":" + entry.getValue() + " ");
        }

        sc.close();
    }
}