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
public class Interface1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here'
         if(args.length==3) 
         { 
                TwoWheeler objBike = new TwoWheeler(args[0], args[1]);
                 objBike.displayDetails();                   
                 objBike.start();                    
                 objBike.accelerate(Integer.parseInt(args[2]));
                   objBike.brake();                    
                   objBike.stop();                          
         }                
         else
         {                     
             System.out.println("Usage: java TwoWheeler <ID> <Type> <Speed>");              
         } 
         
    }
    
}
