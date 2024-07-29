package day7;

import java.util.*;

public class test3 {
    public static void main(String[]args)
    {
        StringBuilder obj = new StringBuilder("hello");
        for(int i = 0 ; i < obj.length()/2 ; i++)
        {
            int front = i;
            int back = obj.length()-i-1;
            char frontchar = obj.charAt(front);
            char backchar = obj.charAt(back);
            obj.setCharAt(front, backchar);
            obj.setCharAt(back, frontchar);
        }
        
        System.out.println(obj);    
    }
}
