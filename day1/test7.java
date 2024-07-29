package day1;

import java.util.Scanner;

public class test7 {
    public static void main(String[]args)
    {
        // write a program to find a factorial of a number

        Scanner obj = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = obj.nextInt();
        int sum = 1;
        for(int i = 1;i <= num;i++ )
        {
            sum = sum * i;
        }
        System.out.println(sum);
    }
}
