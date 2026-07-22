import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Day25 {

    // Insert node at the end
    public static Node insert(Node head, int data) {

        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    // Count occurrences of the key
    public static int countOccurrences(Node head, int key) {

        int count = 0;
        Node temp = head;

        while (temp != null) {

            if (temp.data == key) {
                count++;
            }

            temp = temp.next;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node head = null;

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            head = insert(head, sc.nextInt());
        }

        System.out.print("Enter key to count: ");
        int key = sc.nextInt();

        int count = countOccurrences(head, key);

        System.out.println("Occurrences of " + key + ": " + count);

        sc.close();
    }
}