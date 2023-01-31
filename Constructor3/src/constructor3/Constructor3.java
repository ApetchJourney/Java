/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package constructor3;

/**
 *
 * @author sanasheeraz
 */
class Box
{
    double width, height , depth;
    Box(double w,double h ,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    void Area()
    {
        double ar;
        ar=width*height*depth;
        System.out.println("Area is "+ar);
    }
}
public class Constructor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Box obj=new Box(2,3,4);
        Box obj1=new Box(10,20,30);
        Box obj2=new Box(5,10,15);
        obj1.Area();
        obj2.Area();
    }
    
}
