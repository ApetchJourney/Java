 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package passobject;

/**
 *
 * @author SanaSheeraz
 */
class A
{
   int i;
   int j;
   
}
class B extends A
{
    B(A obj)
    {
        
    }
}
public class PassObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A a=new A();
        B b=new B(a);
    }
    
}
