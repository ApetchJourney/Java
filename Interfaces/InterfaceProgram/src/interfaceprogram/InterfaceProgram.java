/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaceprogram;

/**
 *
 * @author SanaSheeraz
 */
public class InterfaceProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Obama obama=new Obama("Ali",2);
        System.out.println("President Name : "+obama.getName());
        System.out.println("President Id : "+obama.getId());
        
        obama.JoinParty();
        obama.WinElection();
    }
    
}
