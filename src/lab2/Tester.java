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
        System.out.println("StarFish arm stuff: \n=====================================");
        System.out.println(new LeftArm());
        System.out.println(new GrippingArm());
        System.out.println(new StarFish());
        
        StarFish star1 = new StarFish();
        int num1 = 1;
        double num2 = 6.9;
        String str1 = "pickle";
        
        star1.arm(num1);
        star1.arm(num2);
        star1.arm(str1);
        star1.arm(new LeftArm());
        star1.arm(new GrippingArm());

        PisasterBrevispinus star2 = new PisasterBrevispinus();
        System.out.println("\nPisasterBrevispinus arm stuff: \n=====================================");
        star2.arm(num1);
        star2.arm(str1);
        star2.arm(new GrippingArm());
        star2.leg(str1);
        
        byte smol1 = 8;
        float big = 2.718f;
        
        //should cast to int
        star2.arm(smol1);
        //should cast to double
        star2.arm(big);
        //should cast to 2
        star2.arm((int)big);
        
        StarFish iWasCastUp = new StarFish();
        iWasCastUp = star2;
        PisasterBrevispinus iWasCastDown = new PisasterBrevispinus();
        //error
        //iWasCastDown = star1;
        
    }
}
