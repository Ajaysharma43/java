package day20;

import java.util.*;

public class test1 {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        TreeMap<Integer, Integer> tree = new TreeMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (tree.containsKey(arr[i])) {
                tree.put(arr[i], tree.get(arr[i]) + 1);
            } else {
                tree.put(arr[i], 1);
            }
        }

        for (Integer key : tree.keySet()) {
            if (tree.get(key) > arr.length / 3) {
                System.out.println(key);
            }
        }
    }
}
