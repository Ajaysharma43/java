package day2;

import java.util.Scanner;

public class test5 {

    public static void main(String[]args)
    {
        // write a program to check wheather it is vowel or consonent
        Scanner obj = new Scanner(System.in);
        System.out.print("enter the alphabet : ");
        String a = "o";
        a = a.toLowerCase();

        if(a == "a" || a == "e" || a == "i" || a == "o" || a == "u")
        {
            System.out.println(a + " is a vowel");
        }
        else
        {
            System.out.println(a + " is a consonent");
        }
    }
}