package day1;

class abc {
    int a = 1;
    abc(int a)
    {
        System.out.println(this.a);
    }
}

public class test17 {
    int x = 5;
    public static void main(String[]aegs)
    {
        test17 obj = new test17();
        abc data = new abc(5);

        int value = obj.x;
        System.out.println(value);
    }
}
