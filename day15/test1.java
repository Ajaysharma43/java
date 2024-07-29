package day15;

import java.util.Queue;

public class test1 
{
    static class queue
    {
        static int arr[];
    static int size;
    static int rear;
    queue(int n){
        arr=new int[n];
        size=n;
        rear=-1; 
    }

    public static boolean isEmpty()
    {
        return rear==-1;
    }
    public static void add(int data)
    {
        if(rear==size-1)
        {
            System.out.println("queue is full");
            return;
        }
        rear=rear+1;
        arr[rear];
    }
    public static int remove()
    {
        if (isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }
        int front = arr[0];
        for(int i = 0 ; i < rear ; i++)
        {
            arr[ i] = arr[i+1];
        }
        rear=rear+1;
        return front;

    }
    public static void data(int data)
    {
        if(rear==size-1)
        {
            System.out.println("queue is full");
            return;
        }
        rear=rear+1;
        arr[rear]=data;
    }
    public static int seek()
    {
        if(isEmpty())
        {
            System.out.println("empty queue");
            return -1;
        }
        return arr[0];
    }
    }
    
   
    public static void main(String[] args) 
    {
        queue q = new queue(rear);
        q.add(4);
        q.add(5);
        q.add(6);

    }
}
