/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abstraction1;
/**
 *
 * @author SanaSheeraz
 */
public class Abstraction1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Employee emp=new Employee();
        Shape objShape; // Declare the Shape object
        String shape; // Variable to store the type of shape 
       if(args.length==2) { // Check the number of command line arguments
     //Retrieve the value of shape from args[0]
       shape = args[0].toLowerCase(); // converting to lower case
       switch(shape){
      // Assign reference to Shape object as per user input
     case "circle": objShape = new Circle();
     objShape.calculate(Float.parseFloat(args[1]));   //The Float.parseFloat() static method parses the string argument and returns a float value.
      break;
     case "rectangle": objShape = new Rectangle();
    objShape.calculate(Float.parseFloat(args[1]));
     break;
    }
   }
    else{
 // Error message to be displayed when arguments are not supplied
     System.out.println("Usage: java Calculator <shape-name> <value>");
 }
    }
    
}
