package day3;

class animal{
    public void sound()
    {
        System.out.println("some generic sound");
    }
}

class cat extends animal{
    public void sound()
    {
        super.sound();
        System.out.println("mew ");
    }
}

public class test6 {
    public static void main(String[]args)
    {
        cat d = new cat();
        d.sound();
    }
}
