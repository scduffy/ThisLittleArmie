package lab2;

public class Tester
{
    /**
    * This is our code! It’s goal is to get an a on this lab!
    * CS 312 - Lab 2
    * @author Driver’s Chase Duffy
    * @author Co-Pilot’s Jordan Hettleman
    * @version 1.0 9/11/18
    */
    
    public static void main(String [] args)
    {
        System.out.println("Hello World");
        System.out.println(new LeftArm());
        System.out.println(new GrippingArm());
        System.out.println(new StarFish());
        
        StarFish star1 = new StarFish();
        PisasterBrevispinus star2 = new PisasterBrevispinus();
        
        star1.arm(1);
        star1.arm(1.2);
        star1.arm("yeet");
        star1.arm(new LeftArm());
        star1.arm(new GrippingArm());
    }
}
