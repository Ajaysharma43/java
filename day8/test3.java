package day8;

public class test3 {
    
    public static void main(String[]args)
    {
        int n = 10001;
        
        int ans = binaryToDecimal(n);
        System.out.println(ans);
    }
    public static int binaryToDecimal(int n)
    {
        int pow = 0;
        int decimal = 0; 
        while (n > 0) 
        {
            int lastdigit = n % 10;
            decimal += lastdigit * Math.pow(2, pow);
            n /= 10;
            pow++;
        }

        return decimal;
    }
}
