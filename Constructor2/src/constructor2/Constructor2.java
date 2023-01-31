/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package constructor2;

/**
 *
 * @author sanasheeraz
 */
class Box
{
    int width , height ,depth;
    Box()
    {
        width=10;
        height=20;
        depth=50;
    }
    void Area ()
    {
        int ar;
        ar=width*height*depth;
        System.out.println("Area is "+ar);
    }
}
public class Constructor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Box obj=new Box();
        obj.Area();
    }
    
}
