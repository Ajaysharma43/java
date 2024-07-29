package day2;
// write a program to get input of three number and find out the greatest number

import java.util.Scanner;

public class test4 {
    public static void main(String[]args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the numbers");
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();

        if(a > b && a > c)
        {
            System.out.println(a + " is greatest");
        }
        else if(b > a && b > c)
        {
            System.out.println(b + "  is greatest");
        }
        else
        {
            System.out.println(c + " is greatest");
        }
    }
}
