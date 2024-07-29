package day9;

public class test9 
{
    public static void main(String[] args) 
    {
        int[] arr = {2,2,3,3,4,4,5};
        int ans = 0;

        for(int i = 0 ; i < arr.length ; i++ )
        {
            ans ^= arr[i];
        }
        System.out.println(ans);
    }
}
