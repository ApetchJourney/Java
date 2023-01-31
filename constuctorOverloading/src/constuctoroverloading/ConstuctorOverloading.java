/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package constuctoroverloading;

/**
 *
 * @author sanasheeraz
 */
class Box
{
    double width, height,depth;
    Box()
    {
        System.out.println("Box() ");
        width=height=depth=0;
    }
    Box(double w)
    {
        width=w;
        height=depth=0;
        System.out.println("Box(int w)");
    }
    Box(double w,double h)
    {
        width=w;
        height=h;
        depth=0;
        System.out.println("Box(int w,int h");
    }
    Box(double w,double h, double d)
    {
        width=w;
        height=h;
        depth=d;
        System.out.println("Box(int w,int h ,int d)");
    }
    void Area()
    {
        double ar=width*height*depth;
        System.out.println(ar);
    }
}
public class ConstuctorOverloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Box obj=new Box();
         obj.Area();
        Box obj2=new Box(1);
        obj2.Area();
        Box obj3=new Box(1,2);
        obj3.Area();
        Box obj4=new Box(1,2,3);
        obj4.Area();
       
        /*
        obj.Area();
        obj2.Area();
        obj3.Area();
        obj4.Area();
        */
        
        
    }
    
}
