package lab2;

//Step 7
public class StarFish
{
    public void arm(int thing)
    {
        System.out.println("A StarFish's " + thing + " arm.");
    }
    
    public void arm(double thing)
    {
        System.out.println("A StarFish's " + thing + " arm.");
    }
    
    public void arm(String thing)
    {
        System.out.println("A StarFish's " + thing + " arm.");
    }
    
    public void arm(LeftArm thing)
    {
        System.out.println("A StarFish's " + thing + " arm.");
    }
    
    public void arm(GrippingArm thing)
    {
        System.out.println("A StarFish's " + thing + " arm.");
    }
    
    @Override
    public String toString()
    {
        return "Starfish here";
    }
}
