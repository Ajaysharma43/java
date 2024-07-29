package day10;

public class test4 {

    public static boolean ispalindrome(String str)
    {
        if(str.length() <= 1)
        {
            return true;
        }
        char firstchar = str.charAt(0);
        char lastchar = str.charAt(str.length()-1);
        if(firstchar != lastchar)
        {
            return false;
        }

        String Rsubstring = str.substring(1, str.length()-1);
        return ispalindrome(Rsubstring);
    }
    public static void main(String[]args)
    {
        boolean ans = ispalindrome("madam");
        System.out.println(ans);
    }
}
