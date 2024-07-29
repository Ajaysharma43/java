package day14;

import java.util.*;

public class test2 {
    static class node {
        int data;
        node next; // Use your own 'node' class instead of 'Node'

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static node head = null; // Use your own 'node' class instead of 'Node'

        public static boolean isEmpty() {
            return (head == null);
        }

        public static void push(int data) {
            node newNode = new node(data); // Use your own 'node' class
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
