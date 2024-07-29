package day10;

public class test3 {
    public static void main(String[]args)
    {
        print(4);
    }

    static void print(int n)
    {
        if(n < 0)
        {
            return ;
        }
        else
        {
            System.out.println(n);
            print(n - 1);
        }
    }
}
