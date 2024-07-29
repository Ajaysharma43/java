package day13;

public class test3 {
    static class node<T> {
        T data;
        node<T> next;
        node<T> prev;

        public node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    private int deleteFirst() {
        if (head==null) {
            return -1;
        }
        if (size==1) {
            int val=head.data;
            head=tail=null;
            return val;
        }
        int val= head.data;
        size--;
        head=head.next;
        head.prev=null;
        return val;
    }

    private int deleteLast() {
        if (tail==null) return -1;
        if (size==1) {
            int val=head.data;
            head=tail=null;
            return val;
        }
        int val= head.data;
        size--;
        tail=tail.prev;
        tail.next=null;
        return val;
    }
    public static void main(String[] args) {
        test3 obj = new test3();
        obj.addFirst(40);
        obj.addFirst(30);
        obj.addFirst(20);
        obj.addFirst(10);
        obj.addFirst(5);
        obj.display();
        obj.addLast(50);
        obj.addLast(60);
        obj.display();
        obj.deleteLast();
        obj.display();
        obj.deleteFirst();
        obj.display();
    }

    public static node<Integer> head;
    public static node<Integer> tail;
    public static int size;

    public void addFirst(int data) {
        node<Integer> newNode = new node<>(data);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        node<Integer> newNode = new node<>(data);
        size++;
        if (tail == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }


    public void display() {
        node<Integer> curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("end");
    }



    

}