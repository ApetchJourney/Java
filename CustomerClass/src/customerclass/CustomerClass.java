/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerclass;

/**
 *
 * @author Sana
 */
class Customer
{
    String Acc_No;
    String Cust_Name;
    int Age;
    String Address;
    
}
public class CustomerClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ClassName ObjectName=new Classname();
        Customer customer=new Customer();
        customer.Acc_No="Acc1234";
        customer.Cust_Name="Ali";
        customer.Age=40;
        customer.Address="Karachi";
        System.out.println("Account Number : "+customer.Acc_No);
        System.out.println("Customer Name : "+customer.Cust_Name);
        System.out.println("Age : "+customer.Age);
        System.out.println("Address : "+customer.Address);
        
        Customer abc=new Customer();
        abc.Acc_No="Acc2324";
        abc.Cust_Name="Shakoor";
        abc.Age=39;
        abc.Address="Islamabad";
        System.out.println("Account Number : "+abc.Acc_No+"\nCustomer name "+abc.Cust_Name+"\nAge : "+abc.Age+"\nAddress : "+abc.Address);
        
        Customer cust=new Customer();
        System.out.println("Account Number : "+cust.Acc_No);
        System.out.println("Customer Name : "+cust.Cust_Name);
        System.out.println("Age : "+cust.Age);
        System.out.println("Address : "+cust.Address);
        
    }
    
}
