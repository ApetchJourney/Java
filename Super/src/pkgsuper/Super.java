/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgsuper;

/**
 *
 * @author SanaSheeraz
 */
class A 
{ 
    int i; 
}
// Create a subclass by extending class A. 
class B extends A 
{ 
    int i; // this i hides the i in A
    B(int a, int b)
    { 
      super.i = a; // i in A 
      i = b; // i in B
    }
    void show() 
    { 
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i); 
    }
}

public class Super {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        B subOb = new B(1, 2);
        subOb.show();

    }
    
}
