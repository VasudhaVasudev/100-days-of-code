import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Day23 {

    // Insert node at the end of the linked list
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

    // Merge two sorted linked lists
    public static Node merge(Node head1, Node head2) {

        Node dummy = new Node(0);
        Node tail = dummy;

        while (head1 != null && head2 != null) {

            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }

            tail = tail.next;
        }

        if (head1 != null) {
            tail.next = head1;
        }

        if (head2 != null) {
            tail.next = head2;
        }

        return dummy.next;
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

        System.out.print("Enter number of nodes in first list: ");
        int n = sc.nextInt();

        Node head1 = null;

        System.out.println("Enter " + n + " sorted elements:");

        for (int i = 0; i < n; i++) {
            head1 = insert(head1, sc.nextInt());
        }

        System.out.print("Enter number of nodes in second list: ");
        int m = sc.nextInt();

        Node head2 = null;

        System.out.println("Enter " + m + " sorted elements:");

        for (int i = 0; i < m; i++) {
            head2 = insert(head2, sc.nextInt());
        }

        Node mergedHead = merge(head1, head2);

        System.out.println("Merged Linked List:");
        printList(mergedHead);

        sc.close();
    }
}