package day10;

public class test1
{
    public static void main(String[]args)
    {
       print(1); 
    }

   public static void print(int n)
   {
    if(n == 6)
    {
        return;
    }
    else{
        System.out.println(n);
        print(n+1);
    }
   }

}