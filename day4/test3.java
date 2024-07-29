package day4;

public class test3 {
    public static void main(String[]args)
    {
        // write a program to duplicate of the array
        int arr[] = {1,2,3};
        int duplicate[] = new int[arr.length];

        for(int i = 0 ; i < arr.length ; i++)
        {
            duplicate[i] = arr[i];
        }

        System.out.println("duplicate array : ");
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.println(duplicate[i]);
        }
    }
}
