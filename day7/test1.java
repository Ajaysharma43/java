package day7;

public class test1
{
    public static void main(String[]args)
    {
        // write a program to find the distance between two words in array of string
        String array[] = {"bmw" , "audi" , "akshit" , "akash" , "gourav"};
        String word1 = array[0];
        String word2 = array[4];

        int count = 0;

        for(int i = 0 ; i < array.length ; i++ )
        {
            if(array[i] == word1)
            {
                count = 0;
            }
            if(array[i] == word2)
            {
                break;
            }
            else
            {
                count++;
            }
        }
        System.out.println("distance between word 1 and word 2 is : " + (count-1));
    }
}