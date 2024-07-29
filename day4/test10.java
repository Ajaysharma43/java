package day4;

public class test10 {
    public static void main(String[]args)
    {
        int arr[] = {5,2,4,8,45,4};
        int search = 4;

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(search == arr[i])
            {
                System.out.println("item  " + search + " found at index " + i);
            }
        }

    }
}
