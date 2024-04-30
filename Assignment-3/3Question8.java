//How to find nth element from end of linked list

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    Node findNthFromEnd(int n) {
        if (head == null || n <= 0) {
            return null;
        }

        Node fastPtr = head;
        Node slowPtr = head;

        for (int i = 0; i < n; i++) {
            if (fastPtr == null) {
                return null;
            }
            fastPtr = fastPtr.next;
        }

        while (fastPtr != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next;
        }

        return slowPtr;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Original list:");
        list.display();

        int n = 2;
        Node nthFromEnd = list.findNthFromEnd(n);
        if (nthFromEnd != null) {
            System.out.println("The " + n + "th element from the end is: " + nthFromEnd.data);
        } else {
            System.out.println("Invalid input or list is too short.");
        }
    }
}
