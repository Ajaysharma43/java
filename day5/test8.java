package day5;

public class test8 {

    
    public static void main(String[]args)
    {
        int arr[] = {2,4,8,6,1,5};
        for(int i = 1 ; i < arr.length  ; i++ )
        {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < current)
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        for( int i : arr)
        {
            System.out.println(i);
        }
    }

}
