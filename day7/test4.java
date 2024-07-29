package day7;

import java.util.*;

public class test4 {
    public static void main(String[]args)
    {
       String s = "abcdabc";
       int start = 0;
       int end = 0;
       int max = 0;
       int maxstart = 0;
       List<Character> list  = new ArrayList<>();

       while (end < s.length()) 
       {
         if(!list.contains(s.charAt(end)))
         {
            list.add(s.charAt(end));
            end++;
            if(list.size() > max)
            {
                max = list.size();
                maxstart = start;
            }

         }
         else{
            list.remove(Character.valueOf(s.charAt(start)));
            start++;
         }
       }
       String maxlengthString = s.substring(maxstart, maxstart + max);
       System.out.println("maximum length is : "+max);
       System.out.println("substring of maximum length is : "+maxlengthString);
    }
}
