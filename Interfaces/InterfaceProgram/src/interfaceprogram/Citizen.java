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
public class Citizen{
   private String Name;
   private int id;

    public Citizen(String Name, int id) {
        this.Name = Name;
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
   
}
