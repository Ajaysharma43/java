package day4;

public class test11 {
    public static void main(String[]args)
    {
        int arr[] = {12,53,23,76,45,86,65};
        int search = 65;
        int left = arr[0];
        int right = arr[arr.length - 1];

        int mid = left + (right - left) / 2;
        while (search > 0) {
            if(search < mid)
            {
                left = mid + 1;
                mid = (right + left) / 2;
            }
            else if(mid == search)
            {
                System.out.println(mid);
                break;
            }
            else
            {
                right =  mid + 1;
                mid = (right + left) / 2;
            }
        }

    }
}
