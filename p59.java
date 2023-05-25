import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class p59 {
    public static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }

        return head;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void demergeList(Node head) {
        if (head == null || head.next == null) {
            System.out.println("List is empty or contains only one element.");
            return;
        }

        Node oddHead = null;
        Node evenHead = null;
        Node oddTail = null;
        Node evenTail = null;

        Node current = head;
        int count = 1;

        while (current != null) {
            if (count % 2 != 0) {
                if (oddHead == null) {
                    oddHead = current;
                    oddTail = current;
                } else {
                    oddTail.next = current;
                    current.prev = oddTail;
                    oddTail = current;
                }
            } else {
                if (evenHead == null) {
                    evenHead = current;
                    evenTail = current;
                } else {
                    evenTail.next = current;
                    current.prev = evenTail;
                    evenTail = current;
                }
            }

            current = current.next;
            count++;
        }

        if (oddTail != null) {
            oddTail.next = null;
        }
        if (evenTail != null) {
            evenTail.next = null;
        }

        System.out.println("Odd List:");
        printList(oddHead);
        System.out.println("Even List:");
        printList(evenHead);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node head = null;

        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            head = insert(head, data);
        }

        System.out.println("Original List:");
        printList(head);

        System.out.println("Demerged Lists:");
        demergeList(head);

        scanner.close();
    }
}
