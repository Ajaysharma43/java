package day8;

import java.util.Scanner;

public class test2 {
    public static void decimalToBinary(int n)
    {
        int[] binarynum = new int[1000];
        int i = 0;
        while (n > 0) {
            binarynum[i] = n % 2;
            n = n / 2;
            i++;
        }

        for(int j = i - 1 ; j >= 0 ; j--)
        {
            System.out.print(binarynum[j]);
        }
    }
    public static void main(String[]args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the number : ");
        int binary = obj.nextInt();
        decimalToBinary(binary);

    }
}
