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
public class Obama extends Citizen implements Politician , President{

    public Obama(String Name, int id) {
        super(Name, id);
    }

    @Override
    public void JoinParty() {
        System.out.println("Joined Party");
    }

    @Override
    public void WinElection() {
        System.out.println("Won election");
    }
    
    
}
