/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package upcasting;

import java.util.Scanner;

/**
 *
 * @author Sana
 */
class Shape
{
    void calArea()
    {
        
    }
}
class Rectangle extends Shape
{
    
    void calArea()
    {
        
    }
}
class Square extends Shape
{
    void calArea()
    {
        
    }
}
public class UpCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape shape=new Shape();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter shape name:");
        String sh=sc.next();
        if(sh=="Rectangle")
        {
            shape=new Rectangle();
        }else if(sh=="Square")
        {
            shape=new Square(); //upcasting
        }
        
        shape.calArea();
        
        Rectangle rect=(Rectangle)new Shape(); //downcasting
    }
    
}
