package day4;

public class test4 {
    public static void main(String[]args)
    {
        int arr[] = new int[]{1,2,3,4,3,2};
         for(int i = 0 ; i < arr.length ; i++)
         {
            for(int j = i + 1 ; j < arr.length ; j ++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println("duplicate element are " + arr[j]);
                    
                }
            }
         }
    }
}
