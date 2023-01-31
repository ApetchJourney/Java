/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package methodoverriding;

/**
 *
 * @author SanaSheeraz
 */
class A{
    void show_num(){
        System.out.println("Method Of Class A");
    }
}
class B extends A{
    @Override
    void show_num(){
        System.out.println("Method Of Class B");
    }
}
public class MethodOverriding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        B obj=new B();
        obj.show_num();
    }
    
}
