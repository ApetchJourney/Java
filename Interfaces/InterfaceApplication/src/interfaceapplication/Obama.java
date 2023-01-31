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
public class Obama extends Citizen implements President , Father , Politician {

    public Obama(String Name, int ID) {
        super(Name, ID);
    }

    @Override
    public void winElection() {
        System.out.println("Won the Election");
    }

    @Override
    public void party() {
        System.out.println("join The Party");
    }

    @Override
    public void care() {
        System.out.println("Responsible");
    }
    
}
