package day1;

public class test18 {
    int modelyear;
    String modelname;

    public test18(int year , String name)
    {
        this.modelyear = year;
        this.modelname = name;
    }

    public static void main(String[]args)
    {
        test18 mycar = new test18(1996, "mustang");
        System.out.println(mycar.modelyear + " " + mycar.modelname);
    }
}