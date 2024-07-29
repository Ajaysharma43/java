package day7;

import java.util.*;

public class test2 {
    public static void main(String[]args)
    {
        StringBuilder obj = new StringBuilder("tony");
        
        System.out.println(obj);
        obj.setCharAt(0, 'p');
        obj.insert(0, 't');
        obj.append("e");
        System.out.println(obj.indexOf("p"));
    }
}