class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null || data < head.data) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null && current.next.data < data) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void sort() {
        if (head == null || head.next == null) {
            return; // Already sorted or empty list
        }

        Node current = head;
        Node sortedHead = null;
        Node sortedTail = null;

        while (current != null) {
            Node nextNode = current.next;

            if (sortedHead == null || current.data < sortedHead.data) {
                current.next = sortedHead;
                sortedHead = current;
            } else {
                Node temp = sortedHead;

                while (temp.next != null && current.data > temp.next.data) {
                    temp = temp.next;
                }

                current.next = temp.next;
                temp.next = current;
            }

            current = nextNode;
        }

        head = sortedHead;
    }

    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class p37 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add elements to the linked list
        list.insert(30);
        list.insert(10);
        list.insert(50);
        list.insert(20);
        list.insert(40);

        System.out.println("Linked List before sorting:");
        list.display();

        // Sort the linked list in ascending order
        list.sort();

        System.out.println("Linked List after sorting:");
        list.display();
    }
}
