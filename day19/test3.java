package day19;

import java.util.*;

public class test3 {
    public static void main(String[]args)
    {
        HashMap<Integer,String> data = new HashMap<>();
        data.put(1, "apple");
        data.put(2, "mango");
        data.put(3, "banana");
        System.out.println(data);
        System.out.println(data.get(1));
        System.out.println(data.containsKey(1));
    }
}
