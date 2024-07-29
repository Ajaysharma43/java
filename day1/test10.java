package day1;

public class test10 {

    int fun(int a , int b)
    {
        int c = a + b;
        return c;
    }
    public static void main(String[]args)
    {
        int a = 3, b = 8;
        test10 obj = new test10();
        int ans = obj.fun(a,b);
        System.out.println(ans);
    }
}
