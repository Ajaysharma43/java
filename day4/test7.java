package day4;

public class test7 
{
    public static void main(String[]args)
    {
        int arr[] = {23,53,23,35,75,36,105};
        int max = arr[0];

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println("max number is : " + max);
    }
}
