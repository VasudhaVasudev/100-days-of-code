import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;
        int count = 0;

        // Prefix sum 0 occurs once before starting
        map.put(0, 1);

        for (int i = 0; i < n; i++) {

            prefixSum += arr[i];

            if (map.containsKey(prefixSum)) {
                count += map.get(prefixSum);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        System.out.println("Count of zero-sum subarrays: " + count);

        sc.close();
    }
}