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
public class Citizen {
    private String Name;
    private int ID;

    public Citizen(String Name, int ID) {
        this.Name = Name;
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    
    
}
