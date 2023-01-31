/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodreferencedemo;

import java.util.function.Function;

/**
 *
 * @author Sana
 */
public class MethodReferenceDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          Test t1=new Test();
//        t1.Method1();
//        Test.StaticMethod(4);
        
        Function<Integer,Integer> f1 = Test::StaticMethod;
        System.out.println("Return : "+f1.apply(4));
        
        Function<Integer,Integer> f2 = t1::Method1;
        System.out.println("Return from Instance Method : "+f2.apply(5));
        
    }
    
}
