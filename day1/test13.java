package day1;

public class test13 {

    static int plusmethodint(int x , int y)
{
    return x + y;
}

static double plusmethoddouble(double x , double y)
{
    return x + y;
}
    public static void main(String[]args)
    {
        int mynum = plusmethodint(8, 5);
        double mynum2 = plusmethoddouble(4.3, 6.26);
        System.out.println(" int "+mynum);
        System.out.println(" double "+mynum2);
    }
}