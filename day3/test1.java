package day3;

class a {
    public void name(String name)
    {
        System.out.println("rohan");
    }
}

class b extends a{
    public void rollno(int x)
    {
        System.out.println(x);
    }
}

public class test1 extends b {
    public static void main(String[]args)
    {
        B obj = new B();
        obj.name("rohan");
        obj.rollno(12);
    }
}
