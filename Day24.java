import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Day24 {

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

    // Delete first occurrence of the key
    public static Node deleteNode(Node head, int key) {

        if (head == null) {
            return null;
        }

        // If first node contains the key
        if (head.data == key) {
            return head.next;
        }

        Node current = head;
        Node previous = null;

        while (current != null && current.data != key) {
            previous = current;
            current = current.next;
        }

        // Key found
        if (current != null) {
            previous.next = current.next;
        }

        return head;
    }

    // Print linked list
    public static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
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

        System.out.print("Enter key to delete: ");
        int key = sc.nextInt();

        head = deleteNode(head, key);

        System.out.println("Linked List after deletion:");
        printList(head);

        sc.close();
    }
}