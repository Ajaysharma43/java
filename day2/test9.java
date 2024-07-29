package day2;

public class test9 {
    
    public static void main(String[]args)
    {
        int a = 0;
        for(int i = 1 ; i < 5 ; i++)
        {
            for(int j = 0;j < i;j++)
            {
                a = a + 1;
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
