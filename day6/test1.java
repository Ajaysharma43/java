package day6;

public class test1 {

    public static int partition(int arr[] , int low , int high)
    {
        int pivot =  arr[high];
        int i = low - 1;
        for(int j = low ; j < high  ; j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
    public static void Quicksort(int arr[],int low,int high)
    {
        if(low < high)
        {
            int pidx = partition(arr,low,high);
            Quicksort(arr,low,pidx - 1);
            Quicksort(arr,pidx+ 1,high);
        }
    }
    public static void main(String[]args)
    {
        int arr[] = {3,5,4,2,6,1};
        int n = arr.length;
        Quicksort(arr,0,n - 1);
        for(int i = 0  ; i < n ; i++ )
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
