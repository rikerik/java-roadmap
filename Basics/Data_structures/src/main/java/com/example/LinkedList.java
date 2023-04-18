package main.java.com.example;

//LINKED LISTS
//Search O(n)
//implementation of Linked list

class LinkedList {
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

public class LinkedList {
    public static void main(String[] args) {

        // Starting with an empty list
        LinkedList lList = new LinkedList();

        lList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        // link the first node to the second
        lList.head.next = second;

        // link the second node to the third
        second.next = third;

        // function call
        lList.printList();

    }
}
