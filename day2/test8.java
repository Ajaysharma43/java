package day2;

public class test8 
{
    public static void main(String[]args)
    {
        int a = 5;
        for(int i = 0;i <= a;i++)
        {
            if(i == 0 || i == a)
            {
                System.out.println("************");
            }
            else
            {
                System.out.println("*" + "          " + "*");
            }
        }
    }
}
