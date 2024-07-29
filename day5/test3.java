package day5;

public class test3 {
    public static void main(String[]args)
    {
        int [][]arr = {{1,1,1},{2,2,2},{3,3,3}};
        int [][]arr1 = {{4,4,4},{5,5,5},{6,6,6}};

        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr.length ; j++ )
            {
                System.out.print(arr[i][j] * arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
