/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javatask;

/**
 *
 * @author sanasheeraz
 */
public class JavaTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int week = 7;
      String day;
	        
      switch (week) {
         case 1:
           day = "Sunday";
           break;
         case 2:
           day = "Monday";
	   break;
         case 3:
           day = "Tuesday";
           break;
         case 4:
           day = "Wednesday";
           break;
         case 5:
           day = "Thursday";
           break;
         case 6:
           day = "Friday";
           break;
         case 7:
           day = "Saturday";
           break;
         default: 
           day = "Invalid day";
           break;
      }
      System.out.println(day+":");
    }
    
}
