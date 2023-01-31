/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package refrence;

/**
 *
 * @author SanaSheeraz
 */
class Box
{
    
}
class BoxWeight extends Box
{
    
}
public class Refrence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Box box=new BoxWeight();
        //BoxWeight weight=new Box();
        //A Superclass Variable Can Reference a Subclass Object
        Box box1=new Box();
        BoxWeight weight1=new BoxWeight();
        box1=weight1;
        //weight1=box1;
    }
    
}
