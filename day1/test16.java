package day1;

public class test16 {
    static void fun(int a,int result)
    {
        if(a == 0)
        {
            return ;
        }
        else
        {
            
            result =  result * a;
            System.out.println(result);
            fun(a - 1,result);
        }
        
    }
    public static void main(String[]args)
    {
        fun(5,1);
        
    }
    
}
