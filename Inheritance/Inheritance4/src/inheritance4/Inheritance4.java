/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritance4;

/**
 *
 * @author SanaSheeraz
 */
class A{
    int width,height,area;
    A(){
        System.out.println("constructor A");
    }
}
class B extends A{
    B(){
        System.out.println("Constructor B");
    }
}
class C extends B{
    C(){
        System.out.println("constructor C");
    }
}
public class Inheritance4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         C obj=new C();
    }
    
}
