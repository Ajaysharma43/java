package day10;

public class test8 {
    public static void bubblesort(int []arr , int n)
    {
        if(n == 1)
        {
            return;
        }
        for(int i = 0 ; i < n - 1 ; i++)
        {
            if(arr[i] > arr[i + 1])
            {
                int teemp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = teemp;
            }
        }
        bubblesort(arr, n-1);
    }
    public static void bubblesort(int arr[])
    {
        bubblesort(arr,arr.length);
    }
    public static void main(String[]args)
    {
        int arr[] = {2,5,2,8,5,4,8};

        bubblesort(arr);
    }
}
