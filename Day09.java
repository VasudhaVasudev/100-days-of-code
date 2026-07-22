import java.util.Scanner;

public class Day09 {

    // Recursive function to reverse a string
    public static String reverse(String str) {

        if (str.length() == 0)
            return "";

        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Reversed String: " + reverse(str));

        sc.close();
    }
}