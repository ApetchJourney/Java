/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionaldemo1;

/**
 *
 * @author Sana
 */
public class FunctionalDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewClass newClass=new NewClass();
        newClass.show();
        NewInterface.Display();
        int abc=newClass.calLength("Hello");
        System.out.println("Length : "+abc);
    }
    
}
