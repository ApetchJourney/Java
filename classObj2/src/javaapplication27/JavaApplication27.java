/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication27;

/**
 *
 * @author SanaSheeraz
 */
class Box
{
    int width=20;
    int height=40;
}
public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Box b1=new Box();
       Box b2=b1;
       b1.width=5;
       b1.height=6;
        System.out.println(b1.width);
        System.out.println(b1.height);
        System.out.println(b2.width);
        System.out.println(b2.height);
       
    }
    
}
