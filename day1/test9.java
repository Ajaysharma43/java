package day1;

public class test9 {
    public static void main(String[]args)
    {
        String car[] = {"BMW","BBT","Volvo","Ford"};
        for(int i = 0;i < car.length;i++)
        {
            System.out.println(car[i]);
        }

        for(String i : car)
        {
            System.out.println(i);
        }
    }
}
