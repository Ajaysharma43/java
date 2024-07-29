package day3;

public class test4 {
    void printthis()
    {
        System.out.println("refrence id of this is : " + this);
    }
    public static void main(String[]args)
    {
        test4 obj = new test4();
        System.out.println(obj);
        obj.printthis();
    }
}
