package day7;

import java.util.ArrayList;

public class test5 {

    public static void main(String[]args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        int n = list.get(0);
        System.out.println(n);
        list.add(1,2);
        System.out.println(list);
        list.set(0, 5);
        System.out.println(list);
        list.add(7);
        System.out.println(list);
    }
}
