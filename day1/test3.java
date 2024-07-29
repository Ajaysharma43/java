package day1;

import java.util.Scanner;

public class test3 {
    public static void main(String[]args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the month");
        String num = obj.next();
        switch (num) {
                case "jan":
                System.out.println("jan winter");
                break;

                case "feb":
                System.out.println("feb winter");
                break;

                case "march":
                System.out.println("march winter");
                break;

                case "april":
                System.out.println("april summer");
                break;

                case "may":
                System.out.println("may summer");
                break;

            default:
            System.out.println("pata nahi");
                break;
        }
    }
}
