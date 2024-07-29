package day1;

public class test8 {
    public static void main(String[]args)
    {
        // write a program to check the sum of odd number between 1 to 10

        int num = 10;
        int sum = 0;
        int i;
        for(i = 0;i < num;i++)
        {
            if(i%2 != 0)
            {
                sum = sum + i;
                System.out.println(sum);
            }
        }
    }
}
