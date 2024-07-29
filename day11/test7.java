package day11;

public class test7 {
    public static void permutation(String str,String perm)
    {
        if(str.length()==0)
        {
            System.out.println(perm);
            return;
        }

        for(int i = 0 ; i < str.length() ;i++)
        {
            char current = str.charAt(i);
            String news  =str.substring(0, i)+str.substring(i+ 1);
            permutation(news, perm+current);
        }
    }
    public static void main(String[]args)
    {
        String name = "ABC";
        permutation(name,"");
    }

   
}
