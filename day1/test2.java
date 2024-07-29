package day1;
import java.util.Scanner;

public class test2 {
    public static void main(String[]args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the marks");
        int marks = obj.nextInt();

        if(marks == 30)
        {
            System.out.println("pass");
        }
        else if(marks >= 30 && marks <= 60)
        {
            System.out.println("c grade");
        }
        else if(marks >= 60 && marks <= 80)
        {
            System.out.println("b grade");
        }
        else if(marks >= 80 && marks <= 100)
        {
            System.out.println("a grade");
        }
        else{
            System.out.println("fail");
        }
    }
}
