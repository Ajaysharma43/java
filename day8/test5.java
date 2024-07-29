package day8;

import java.util.HashMap;
import java.util.Map;

public class test5 {
    public static void main(String[]args)
    {
        int arr[] = {1,2,3,4};
        int target = 8;
        int result[] = findindexsum(arr , target);
        if (result != null) {
            System.out.println("indicates of the two numbers are : "+result[0] + " and " + result[1]);
        }
        else
        {
            System.out.println("not found");
        }
    }

    public static int[] findindexsum(int arr[] , int target)
    {
        Map<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++)
        {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement) ,i};
            }
            map.put(arr[i], null);
        }
        return null;
    }
}
