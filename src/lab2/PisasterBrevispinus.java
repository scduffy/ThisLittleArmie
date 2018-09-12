package lab2;

//Step 8
public class PisasterBrevispinus extends StarFish
{
    //Step 14
	@Override
    public void arm(int thing)
    {
        System.out.println("Something else for " + thing);
    }
    
	//Step 14
	@Override
    public void arm(String thing)
    {
        System.out.println("Something else for " + thing);
    }
    
	//Step 14
	@Override
    public void arm(GrippingArm thing)
    {
        System.out.println("Something else for " + thing);
    }
	
	//Step 22
	// does not have a super method that uses a short
	//Step 23
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
