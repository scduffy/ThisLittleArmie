package lab2;

public class PisasterBrevispinus extends StarFish
{

	@Override
    public void arm(int thing)
    {
        System.out.println("Something else for " + thing);
    }
    
	@Override
    public void arm(String thing)
    {
        System.out.println("Something else for " + thing);
    }
    
	@Override
    public void arm(GrippingArm thing)
    {
        System.out.println("Something else for " + thing);
    }
	
	// does not have a super method that uses a short
//	@Override
//	public void arm(short s)
//	{
//	    System.out.println("Something else for " + s);
//	}
	
    public void leg(String s)
    {
        System.out.println("must be Patrick ... only Patrick ... " + s);
    }
    
    @Override
    public String toString()
    {
        return "FINLAND!";
    }
}
