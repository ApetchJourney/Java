/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritance2;

/**
 *
 * @author SanaSheeraz
 */
class Vehicle {

// Declare common attributes of a vehicle
protected String vehicleNo; // Variable to store vehicle number
protected String vehicleName; // Variable to store vehicle name
protected int wheels; // Variable to store number of wheels
public void accelerate(int speed) {
System.out.println("Accelerating at:"+ speed + " kmph");
}
}
class FourWheeler extends Vehicle
{
  private boolean powerSteer;
  public FourWheeler(String vId, String vName, int numWheels, boolean pSteer){

// Attributes inherited from parent class
vehicleNo = vId;
vehicleName = vName;
wheels = numWheels;

// Child class’ own attribute
powerSteer = pSteer;
}
public void showDetails() {

System.out.println("Vehicle no:"+ vehicleNo);
System.out.println("Vehicle Name:"+ vehicleName);
System.out.println("Number of Wheels:"+ wheels);

if(powerSteer == true)
System.out.println("Power Steering:Yes");
else
System.out.println("Power Steering:No");
}

}
 
public class Inheritance2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FourWheeler objFour = new FourWheeler("LA-09 CS-1406", "Volkswagen",4, true);
        objFour.showDetails(); // Invoke the child class method
        objFour.accelerate(200); // Invoke the inherited method
       
    }
    
}
