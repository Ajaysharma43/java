package day11;

public class test1 {
    public static void main(String[]args)
    {
        
        int r = 4;
        int c = 0;
        triangle(r , c);
    }

    public static void triangle(int r , int c)
    {
        if(r == 0)
        {
            return ;
        }
        if(c < r)
        {
            System.out.print("*");
            triangle(r, c + 1);
        }
        else{
            System.out.println();
            triangle(r-1, 0);
        }
    }
}
