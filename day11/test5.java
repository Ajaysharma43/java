package day11;

public class test5 {
    public static void main(String[]args)
    {
        
        System.out.println(skip("bapplecbad"));
    }

    public static String skip(String m)
    {
        if(m.isEmpty())
        {
            return "";
        }

        
        if(m.startsWith("apple"))
        {
            return skip(m.substring(5));
        }
        else
        {
            return m.charAt(0)+skip(m.substring(1));
        }
    }
}
