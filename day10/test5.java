package day10;

public class test5 {
    public static String reverse(String str)
    {
        if(str.isEmpty() || str.length() == 1)
        {
            return str;
        }
        return reverse(str.substring(1)+ str.charAt(0));
    }
    public static void main(String[]args)
    {
        String name = "hello";
        String ans = reverse(name);
        System.out.println(ans);
    }
}
