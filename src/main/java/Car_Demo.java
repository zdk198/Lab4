/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zachkorte
 */
public class Car_Demo {
    // CarDemo class implementation

   // start main method
   public static void main(String[] args)
   {
       // create a Car object
       Car aCar = new Car(2020, "Hyundai");
      
       // display the car's model and make
       System.out.println("Year model of the car: " + aCar.getYearModel());
       System.out.println("Make of the car: " + aCar.getMake());
       System.out.println();
      
       // call the accelerate method five times and
       // get the current speed of the car and display it each time
       for(int i = 0; i < 5; i++)
       {
           aCar.accelerate();
           System.out.println("Current speed of the car: " + aCar.getSpeed());
       }
      
       // call the brake method five times and
       // get the current speed of the car and display it each time
       for(int i = 0; i < 5; i++)
       {
           aCar.brake();
           System.out.println("Current speed of the car: " + aCar.getSpeed());
       }
      
   } 
}

