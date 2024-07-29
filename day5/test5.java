package day5;

public class test5 {
    public static void main(String[]args)
    {
        int arr[] = {9,3,2,4,1,8};
        int replace = 0; int i , j;
        for(i = 0 ; i < arr.length ; i++)
        {
            for(j = 0 ; j < arr.length-1 ; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    replace = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = replace;
                }
               
            }
        }
         for(i = 0 ; i < arr.length ; i++)
         {
            System.out.print(arr[i] + " ");
         }
    }
}
