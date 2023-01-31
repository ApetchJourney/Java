/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abstraction;

/**
 *
 * @author SanaSheeraz
 */
public abstract class Employee {
    private String Name;
    private String Address;
    private int Number;

    public Employee(String Name, String Address, int Number) {
        this.Name = Name;
        this.Address = Address;
        this.Number = Number;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }
    
    public double computePay()
    {
        System.out.println("Inside Employee computePay");
        return 0.0;  
    }
    
    public void mailCheck(){
        System.out.println("Mailing a check to " + this.Name +"  "+this.Address);
    }

    public String toString()
    {
        return Name+"  "+Address+"  "+Number;
    }

    
}
