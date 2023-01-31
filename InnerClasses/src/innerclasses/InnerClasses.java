 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package innerclasses;

/**
 *
 * @author sanasheeraz
 */
class A
{
    private int a=2;
    B obj1=new B();
    void method()
    {
        System.out.println("Outer Class ");
        obj1.new_method();
    }
    class B
    {
        void new_method()
        {
            System.out.println("Inner Class ");
            System.out.println("Inner " +a);
        }
    }
}
public class InnerClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A obj=new A();
        obj.method();
        
        
    }
    
}
