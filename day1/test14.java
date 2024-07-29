package day1;

public class test14 {
    static void fun(int a)
    {
        System.out.println("int a : " + a);
    }

    static void fun(double a)
    {
        System.out.println("double a : " + a);
    }
    public static void main(String[]args)
    {
        int a = 9;
        fun(a);
        fun(a);
    }
}
