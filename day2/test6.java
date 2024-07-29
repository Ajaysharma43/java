package day2;

public class test6 {
    public static void main(String[]args)
    {
        // write a program to reverse a number
        int a = 38748374;
        while(a > 0)
        {
            int l = a % 10;
            System.out.print(l);
            a = a / 10;
        }
        System.out.println();
    }
}
