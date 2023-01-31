/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaceapplication;

/**
 *
 * @author SanaSheeraz
 */
public class InterfaceApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Obama obama=new Obama("obama",12);
        System.out.println(obama.getName());
        System.out.println(obama.getID());
        obama.winElection();
        obama.care();
        obama.party();
    }
    
}
