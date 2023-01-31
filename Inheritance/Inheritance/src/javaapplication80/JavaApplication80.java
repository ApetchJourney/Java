/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication80;

/**
 *
 * @author SanaSheeraz
 */
class Furniture 
{    
    String ID;    
    float price;     
    public Furniture(String ID, float price)
    {        
        this.ID = ID;        
        this.price = price;     
    }    
    public void displayDetails() 
    {        
        System.out.println("ID: "+ID);         
        System.out.println("Price: "+price);    
    }
}
class Table extends Furniture 
{     
    String type;       
    public Table(String ID, float price, String type) 
    {           
        super(ID,price);        
        this.type = type;   
    }
    @Override
    public void displayDetails()
    {           
        super.displayDetails();        
        System.out.println("Type: "+type);   
    
    }
}
 


public class JavaApplication80 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Furniture obj = new Table("F001 ", 2000F, "Wooden ");      
         obj.displayDetails(); 
    }
    
}
