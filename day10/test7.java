package day10;

public class test7 
{

    public static int hcf(int num1 , int num2)
    {
        if(num2 == 0)
        {
            return num1;
        }

        
        int r = num1%num2;
        return hcf(num2,r);

    }
    public static void main(String[]args)
    {
        int num1 = 16;
        int num2 = 18;
        int ans = hcf(num1, num2);
        System.out.println(ans);
    }
}
