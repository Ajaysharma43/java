package day1;

import java.util.Scanner;

public class test12 {
    boolean fun(int age)
    {
        if(age >= 18)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[]args)
    {
        Scanner data = new Scanner(System.in);
        System.out.println("enter the age");
        int age = data.nextInt();
        test12 obj = new test12();
        boolean ans = obj.fun(age);
        System.out.println(ans);
    }
}
