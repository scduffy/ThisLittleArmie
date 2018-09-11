package lab2;

public class PisasterBrevispinus extends StarFish
{
    public void add(int thing)
    {
        System.out.println("Something else for " + thing);
    }
    
    public void add(String thing)
    {
        System.out.println("Something else for " + thing);
    }
    
    public void add(GrippingArm thing)
    {
        System.out.println("Something else for " + thing);
    }
    
    public void leg(String s)
    {
        System.out.println("must be Patrick ... only Patrick ... " + s);
    }
    
    @Override
    public String toString()
    {
        return "FINlAND!";
    }
}
