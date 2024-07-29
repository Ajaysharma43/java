package day11;

public class test6 {
    public static void main(String[]args)
    {
        String arr = "abc";
        String set = "";
        subset(set , arr);
    }

    public static void subset(String arr , String set)
    {
        if(set.isEmpty())
        {
            System.out.println("{"+arr+"}");
            return;
        }
        
        char ch = set.charAt(0);
        subset(arr+set, set.substring(1));
        subset(arr, set.substring(1));
    }
}
