/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zachkorte
 */

    public class Car
{
   // fields
   private int yearModel; // car's year model
   private String make; // make of the car
   private int speed; // car's current speed
  
   // The constructor accepts the car's year model and make as arguments,
   // then assigns these arguments to the object's yearModel and make
   // fields. It also assigns 0 to the speed field.
   public Car(int newYearModel, String newMake)
   {
       yearModel = newYearModel;
       make = newMake;  
       speed = 0;
   }

   // The getYearModel accessor method returns the value stored in the
// object's yearModel field.
   public int getYearModel()
   {
       return yearModel;
   }

   // The getMake accessor method returns the value stored in the object's
// make field.
   public String getMake()
   {
       return make;
   }

   // The getSpeed accessor method returns the value stored in the object's
// speed field.
   public int getSpeed()
   {
       return speed;
   }

   // The accelerate method adds 5 to the speed field each time it is called.
   public void accelerate()
   {
       speed = speed + 5;
   }

   // The brake method subtracts 5 from the speed field each time it is called.
   public void brake()
   {
       speed = speed - 5;
   }
} // end of Car class



