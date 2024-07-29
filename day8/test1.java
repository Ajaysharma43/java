package day8;

import java.util.ArrayList;

public class test1 {
     public static String romanconvert(int num)
     {
    String symbol[] = {"m","cm","d","cd","c","xc","l","lc","x","xi","v","iv","i"};
    int number[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    

    StringBuilder romannumBuilder = new StringBuilder();

    for(int i = 0 ; i < number.length;i++)
    {
        while (num >= number[i]) 
        {
            romannumBuilder.append(symbol[i]);
            num -= number[i];
        }
    }
    return romannumBuilder.toString();

     }
    public static void main(String[]args)
    {
    //    write a program to convert integer into roman number
    // 1000 - m
    // 900 - cm
    // 500 - d
    // 400 - cd
    // 100 - c
    // 90 - xc
    // 50 - l
    // 40 - lc
    // 10 - x
    // 9 - ix
    // 5 - v
    // 4  - iv
    // 1 - i
    
    

    int num = 1994;
    String roman = romanconvert(num);
    System.out.println(roman);
    
    }
}
