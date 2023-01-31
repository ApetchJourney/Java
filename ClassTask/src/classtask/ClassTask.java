/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classtask;

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
    
    void SetData(String name,String address,int age,int telephone)
    {
        Name=name;
        Address=address;
        Age=age;
        Telephone=telephone;
    }
    void GetData()
    {
        System.out.println("Name : "+Name);
        System.out.println("Address : "+Address);
        System.out.println("Age : "+Age);
        System.out.println("Telephone : "+Telephone);
    }
}
class Employee extends Person
{
    String Designation;
    int Salary;
    float Working_days;
   
    void SetData(String designation,int salary,float working_days)
    {
        Designation=designation;
        Salary=salary;
        Working_days=working_days;
    }
    @Override
    void GetData()
    {
        System.out.println("Designation : "+Designation);
        System.out.println("Salary : "+Salary);
        System.out.println("Working Days : "+Working_days);
    }
}
public class ClassTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Person person=new Person();
        person.SetData("Ali", "North Nazimabad", 33, 12346);
        person.GetData();
        
        Employee employee=new Employee();
        employee.SetData("Staff", 15000, 25);
        employee.GetData();
    }
    
}
