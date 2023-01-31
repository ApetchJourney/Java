/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

import java.util.Scanner;

/**
 *
 * @author Sana
 */
class Customer
{
    public String Owner;
    public String Account_No;
    protected int balance;
    private int Password;
    public String Location;
    public int Contact; 
    public boolean Status;
    
    protected void setPassword()
    {
        Scanner sc=new Scanner(System.in);
        Password=sc.nextInt();
    }
    protected void getPassword()
    {
        System.out.println("Password is : "+Password);
    }
    
}
class Bank extends Customer
{
    void record()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Owner Name : ");
        Owner=sc.next();
        
        System.out.println("Enter Account number : ");
        Account_No=sc.next();
        
        System.out.println("Enter Password : ");
        setPassword();
        
        System.out.println("Enter Balance : ");
        balance=sc.nextInt();
        
        System.out.println("Enter Location : ");
        Location=sc.next();
        
        System.out.println("Enter Contact Number : ");
        Contact=sc.nextInt();
        
        System.out.println("Enter Status : ");
        Status=sc.nextBoolean();
        
    }
    void show_Detail()
    {
        System.out.println("Owner Name : "+Owner);
        System.out.println("Account number : "+Account_No);
        getPassword();
        System.out.println("Balance : "+balance);
        System.out.println("Location : "+Location);
        System.out.println("Contact No : "+Contact);
        System.out.println("Status : "+Status);
    }
}
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bank bk=new Bank();
        bk.record();
        bk.show_Detail();
    }
    
}
