package day8;

public class test4 {
    public static void main(String[]args)
    {
        String name = "hello world";
        String word[] = name.split(" ");

        for(int i = 0 ; i < word.length; i++)
        {
            if (word[word.length-1].equals(word[i])) {
                System.out.println("length of"+" "+word[i]+" is "+word[i].length());
            }
            
        }
    }
}
