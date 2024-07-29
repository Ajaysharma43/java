package day3;
class dadaji
{
    private String car;
    private String villa;
    public dadaji(String car,String villa)
    {
        this.car = car;
        this.villa = villa;
    }
    public String getcar()
    {
        return car;
    }
    public String getvilla()
    {
        return villa;
    }
}

class papaji
{
    private String cycle;
    private dadaji property;
    public papaji(String cycle,dadaji property)
    {
        this.cycle = cycle;
        this.property = property;
    }
    public void sky()
    {
        System.out.println("papa has : " + cycle);
        System.out.println("dadaji has : " + property.getcar() +" and "+ property.getvilla());
    }
}

public class test3 {
    public static void main(String[]args)
    {
        dadaji obj = new dadaji("bmw","villa");
        papaji sky = new papaji("atlas",obj);
        sky.sky();
    }
}
