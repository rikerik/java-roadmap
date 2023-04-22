package main.java.com.example;

//LINKED LISTS
//Search O(n)
//implementation of Linked list

class LinkedLists {
    Node head; // the head of the list

    // Linked list Node. The inner class has to be static so main can acces it
    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        // Next is by default initialized as NULL
        Node(int d) {
            data = d;
            next = null;
        }

    }

    // This func prints out the list starting from the head
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }
}

// Class for doubly linked list
class DLL {
    Node head;

    // Doubly linked list node
    static class Node {
        int data;
        Node prev;
        Node next;

        // next and prev is NULL
        Node(int d) {
            data = d;
        }
    }

    // push function
    public void push(int new_data) {

        // allocate node and put in the data
        Node new_node = new Node(new_data);

        // make next node of the new node as head and previous as NULL
        new_node.next = head;
        new_node.prev = null;

        // change prev of head node to new node linking back
        if (head != null) {
            head.prev = new_node;
        }

        // the new node become the new head node
        head = new_node;
    }

    // add a note at the end of the list
    void append(int new_data) {

        // allocating node and put in data
        Node new_node = new Node(new_data);

        Node last = head; // used when traversing so we start with the first

        // this new node is going to be the last node, so it has NULL as next
        new_node.next = null;

        // if the linked list is empty make the new node as head
        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }

        // else traverse till the last node
        while (last.next != null) {
            last = last.next;
        }

        // change the next of the last node
        last.next = new_node;

        // make the last node as prev of the new node
        new_node.prev = last;

    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data + " ");
            n = n.next;
        }
    }
}

// Circular linked list
class CircularLinkedList {
    public Node head;

    public CircularLinkedList() {
        head = null;
    }

    // adding a node
    public void add_node(int data) {
        Node new_data = new Node(data);
        if (head == null) {
            // if head is null the new node is going to be the head
            head = new_node;
            // the new node which will always be the last in this context, is going to point
            // to the head which is the first, so it goes around
            new_node.next = head;
            return;
        }
        // we use a new Node, named as 'current' to go through the list and insert the
        // new node to its position
        Node current = head;
        while (current.next != head) {
            current = current.next;
        }
        // when the current node points to the head node, we add the new node so it will
        // point to the new
        current.next = new_node;
        // then we make the added new node to point to the head, so it will go in circle
        // again
        new_node.next = head;

    }
}

public class LinkedList {
    public static void main(String[] args) {

        // Starting with an empty list
        LinkedLists lList = new LinkedLists();

        lList.head = new LinkedLists.Node(1);
        LinkedLists.Node second = new LinkedLists.Node(2);
        LinkedLists.Node third = new LinkedLists.Node(3);

        // link the first node to the second
        lList.head.next = second;

        // link the second node to the third
        second.next = third;

        // function call
        // lList.printList();

        DLL dllList = new DLL();

        dllList.head = new DLL.Node(1);
        dllList.push(2);
        dllList.push(3);
        dllList.append(12);

        dllList.printList();
    }
}
