package day7;

import java.util.Arrays;

public class test6 {
    public static void main(String[]args)
    {
        String first = "listen";
        String second = "silent";

        if(first.length() == second.length())
        {
            char[] str1 = first.toCharArray();
            char[] str2 = second.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
            Arrays.equals(str1, str2);
            

        }
        else
        {
            System.out.println("not an anagram");
        }
    }
}
