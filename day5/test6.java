package day5;

public class test6 
{

    public static void fun(int arr[])
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[]args)
    {
        int arr[] = {1,2,3,6,5,4};

        for (int i = 0; i < arr.length; i++) 
        {
            int smallest = i;
             for(int j = i + 1 ; j < arr.length ; j++)
             {
                if(arr[smallest] > arr[j])
                {
                    smallest = j ;
                }
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
             }
        }

        fun(arr);
        
        
    }
}
