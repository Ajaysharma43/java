package day1;
import java.util.Scanner;

public class test {

    public static void main(String[]args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter the age");
        int age = obj.nextInt();
        if(age >= 18)
        {
            System.out.println("you are eligible");
        }
        else{
            System.out.println("you are not eligible");
        }
    }
}