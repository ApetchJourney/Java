/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionaldemo2;

/**
 *
 * @author Sana
 */
public class FunctionalDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MyComparator myCom=() -> {
            System.out.println("Hello World");
        };
        myCom.compareNull();
      
    }
    
}
