package day8;

public class test6 {
    public static void main(String[]args)
    {
        String name = "hello how are you";
        String word[] = name.split(" ");

        for(int i = 0 ; i < word.length ; i++)
        {
            String data = word[word.length - i -1];
            System.out.println(data);
        }
    }
}
