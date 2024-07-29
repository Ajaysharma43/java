package day10;

public class test6 
{

    public static double exponent(double num , int pow)
    {
        if(pow == 00)
        {
            return 1;
        }   
            return num.exponent(num, pow-1);
        
    }
    public static void main(String[] args) 
    {
        {
            double num = 2.5;
            int pow = 3;
            double ans = exponent(num, pow);
            System.out.println(ans);
        }
    }
}
