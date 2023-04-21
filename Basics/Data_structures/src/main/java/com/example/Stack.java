package com.example;

//stack implementation
class StackAsLinkedList {
    // Create the root element
    stackNode root;

    static class stackNode {
        int data;
        stackNode next;

        stackNode(int data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        if (root == null) {
            return true;
        } else
            return false;
    }

    public void push(int data) {
        // Create a new node
        stackNode newNode = new stackNode(data);

        // if there is nothing in the stack, then the new node is going to be the root
        // element
        if (root == null) {
            root = newNode;

            // Otherwise we create a temp node which will store the roots value
            // then we pass the new node value to the root
            // Lastly the next element's value is going to be the original root value
            // so the root will have the new value and and it will be under the new node and
            // it goes on like this, the root wont be the last element

        } else {
            stackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " pushed to stack");
    }

    public int pop() {
        // we give a min value for the root data
        int popped = Integer.MIN_VALUE;
        if (root == null) {
            System.out.println("Stack is empty");
        } else {
            //we will know what data was popped
            popped = root.data;
            // The root is going to be the node which was added before the present root node
            root = root.next;
        }
        return popped;
    }

    public int peek() {
        if (root == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        } else
        //we get the data on the top
            return root.data;
    }
}

public class Stack {
    public static void main(String[] args) {
        StackAsLinkedList sLL = new StackAsLinkedList();

        sLL.push(10);
        sLL.push(20);
        sLL.push(30);

        System.out.println(sLL.pop() + " popped from stack");

        System.out.println("Top element is " + sLL.peek());
    }
}
