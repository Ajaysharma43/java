package day3;
class engine
{
    private String model;
    public engine(String  model)
    {
        this.model = model;
    }

    public String getmodel()
    {
        return model;
    }
}

class car{
    private String name;
    private engine engine;
    public car(String name,engine engine)
    {
        this.name = name;
        this.engine = engine;
    }
    public void display()
    {
        System.out.println("car name : " + name);
        System.out.println("engine name : " + engine.getmodel());
        
    }
}

public class test2 {

    
    public static void main(String[]args)
    {
        engine obj = new engine("v8");
        car obj1 = new car("bmw", obj);
        obj1.display();
       
    }
}
