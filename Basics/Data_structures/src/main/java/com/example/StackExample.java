package com.example;

import java.io.*;
import java.util.*;

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

            // If the root is not null, then the new node is inserted at the top of the
            // stack by assigning it as the new root and setting its next field to point
            // to the previous root. This effectively makes the new node the new top of the
            // stack, with the old top becoming its next element.

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
            // we will know what data was popped
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
            // we get the data on the top
            return root.data;
    }

}

public class StackExample {

    // Stack implementation with interfaces
    static void stack_push(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    // Popping element from the top of the stack
    static void stack_pop(Stack<Integer> stack) {
        System.out.println("Pop operation");
        for (int i = 0; i < 5; i++) {
            Integer popped = (Integer) stack.pop();
            System.out.println(popped);
        }
    }

    // Displaying element on the top of the stack
    static void stack_peek(Stack<Integer> stack) {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
    }

    // Searching element in stack
    static void stack_search(Stack<Integer> stack, int index) {
        Integer pos = (Integer) stack.search(index);

        if (pos == -1)
            System.out.println("No such element on stack: " + index);
        else
            System.out.println("Element is found at position: " + pos);
    }

    public static void main(String[] args) {
        StackAsLinkedList sLL = new StackAsLinkedList();

        sLL.push(10);
        sLL.push(20);
        sLL.push(30);

        // System.out.println(sLL.pop() + " popped from stack");

        // System.out.println("Top element is " + sLL.peek());

        Stack<Integer> stack = new Stack<Integer>();
        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack, 2);
        stack_search(stack, 6);
    }
}
