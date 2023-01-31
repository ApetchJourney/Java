/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package refrencecalling;

/**
 *
 * @author SanaSheeraz
 */
class Circle
{
    double getPI()
    {
        return 3.14;
    }
}
class passByReference
{
    void calArea(Circle obj, double rad)
    {
        double area= obj.getPI() * rad * rad;
        System.out.println("Area of the circle is "+ area);

    }
}
public class RefrenceCalling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        passByReference p1 = new passByReference();
        p1.calArea(new Circle(), 2);

    } 
}
