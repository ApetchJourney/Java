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
public class TwoWheeler implements IVehicle  {
    String  ID;
    String type;
       public TwoWheeler(String ID, String type) 
       {           
           this.ID = ID;      
        this.type = type;    
       }
    @Override
    public void start() 
    {             
        System.out.println("Starting the "+ type);
    }    
    @Override
     public void accelerate(int speed) 
     {        
         System.out.println("Accelerating at speed:"+speed+ " kmph");    
     }   
    @Override
    public void brake() 
    {      
        System.out.println("Applying brakes");  
    }
    @Override
     public void stop() 
     {
         System.out.println("Stopping the "+ type);           
     } 
   public void displayDetails()
   {     
       System.out.println("Vehicle No.: "+ STATEID+ " "+ ID);       
   System.out.println("Vehicle Type.: "+ type);   
   } 
}
