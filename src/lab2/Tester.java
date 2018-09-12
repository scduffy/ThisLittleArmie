package lab2;

//Step 2
public class Tester
{
    //Step 3
    /**
    * This is our code! It’s goal is to get an a on this lab!
    * CS 312 - Lab 2
    * @author Driver’s Chase Duffy
    * @author Co-Pilot’s Jordan Hettleman
    * @version 1.0 9/11/18
    */
    
    //Step 4
    public static void main(String [] args)
    {
        System.out.println("Hello World");
        System.out.println("StarFish arm stuff: \n=====================================");
        System.out.println(new LeftArm());
        System.out.println(new GrippingArm());
        System.out.println(new StarFish());
        
        //Step 10
        StarFish star1 = new StarFish();
        int num1 = 1;
        double num2 = 6.9;
        String str1 = "pickle";
        
        //Step 11
        star1.arm(num1);
        star1.arm(num2);
        star1.arm(str1);
        star1.arm(new LeftArm());
        star1.arm(new GrippingArm());

        //Step 12
        PisasterBrevispinus star2 = new PisasterBrevispinus();
        System.out.println("\nPisasterBrevispinus arm stuff: \n=====================================");
        star2.arm(num1);
        star2.arm(str1);
        star2.arm(new GrippingArm());
        
        //Step 13
        star2.leg(str1);
        
        //Step 17
        byte smol1 = 8;
        float big = 2.718f;
        
        //should cast to int
        star2.arm(smol1);
        
        //Step 18 - should cast to double
        star2.arm(big);
        
        //Step 19 - should cast to 2
        star2.arm((int)big);
        
        //Step 20
        StarFish iWasCastUp = new StarFish();
        iWasCastUp = star2;
        
        //Step 21
        PisasterBrevispinus iWasCastDown = new PisasterBrevispinus();
        //error
        //iWasCastDown = star1;
        
    }
}
