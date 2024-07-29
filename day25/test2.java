package day25;

import java.util.Arrays;

public class test2{
    public static int countway(int n,int ways)
    {
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        if(ways[n]!=-1)
        {
            return ways[n];
        }
        ways[n] =  countway(n-1)+countway(n-2);
        return ways[n];
    }

    public static void main(String[]args)
    {
        int n = 5;
        int ways[] = new int[n+1];
        Arrays.fill(ways, -1);
        System.out.println(countway(n,ways));
    }
}