/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interface1;

/**
 *
 * @author SanaSheeraz
 */
public interface IVehicle {
      static final String STATEID="LA-09"; 
         public void start();
   public void accelerate(int speed);
      public void brake();
    public void stop(); 
}
