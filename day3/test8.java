package day3;

abstract class a{
    private String name;
     public a(String name)
     {
        this.name = name;
     }

     public abstract void makesound();

     public String getname()
     {
        return name;
     }
}


class b extends a {
    public b(String name)
    {
        super(name);
    }

    public void makesound()
    {
        System.out.println(getname() + " barks");
    }
}
public class test8 {
    public static void main(String[]args)
    {
        a obj = new B("hello");
        obj.makesound();
    }
}
