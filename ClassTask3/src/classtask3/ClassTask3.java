/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classtask3;

/**
 *
 * @author SanaSheeraz
 */
class Person
{
    String Name;
    String Address;
    int Age;
    int Telephone;
    
    Person(String name,String address,int age,int telephone)
    {
        Name=name;
        Address=address;
        Age=age;
        Telephone=telephone;
    }
    /*void GetData()
    {
        System.out.println("Name : "+Name);
        System.out.println("Address : "+Address);
        System.out.println("Age : "+Age);
        System.out.println("Telephone : "+Telephone);
    }*/
}
class Employee extends Person
{
    String Designation;
    int Salary;
    float Working_days;
   
    Employee(String designation,int salary,float working_days)
    {
        super("Abdullah", "North Nazimabad", 23, 12746);
        Designation=designation;
        Salary=salary;
        Working_days=working_days;
    }
    
    void GetData()
    {
        System.out.println("Name : "+Name);
        System.out.println("Address : "+Address);
        System.out.println("Age : "+Age);
        System.out.println("Telephone : "+Telephone);
        System.out.println("Designation : "+Designation);
        System.out.println("Salary : "+Salary);
        System.out.println("Working Days : "+Working_days);
        
    }
}
class Manager extends Employee
{
    
    Manager()
    { 
       super("Manager", 30000, 30);
        
    }
    
}
public class ClassTask3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manager manager=new Manager();
        manager.GetData();
    }
    
}
