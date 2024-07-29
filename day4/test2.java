package day4;

import java.util.Scanner;

public class test2 {
    public static void main(String[]args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int size = obj.nextInt();
        int arr[] = new int[size];

        
        System.out.println("enter the elements : ");
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = obj.nextInt();
        }

        System.out.println("the elements are : ");
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
