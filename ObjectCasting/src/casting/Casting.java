/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casting;

/**
 *
 * @author Sana
 */
class Employee
{
    int Id;
    String Name;
    int Salary;
    float Commision;
    public Employee(int Id,String Name,int Salary)
    {
        this.Id=Id;
        this.Name=Name;
        this.Salary=Salary;
    }
    public void calCommision(float sales)
    {
        if(sales>10000)
        {
            Commision=Salary*20/100;
        }else
        {
            Commision=0;
        }
    }
    public void calCommision(int OverTime)
    {
        if(OverTime > 8)
        Commision = Salary/30;
        else
        Commision = 0;
    }
    public void displayDetails()
    {
        System.out.println("Employee ID:"+Id);
        System.out.println("Employee Name:"+Name);
        System.out.println(" Salary:"+Salary);
        System.out.println("Commission:"+Commision);
    }
}
class PartTimeEmployee extends Employee
{
    String shift;
    public PartTimeEmployee(int Id,String Name,int Salary,String shift)
    {
        super(Id,Name,Salary);
        this.shift=shift;
    }
    @Override
    public void displayDetails()
    {
        calCommision(12);
        super.displayDetails();
        System.out.println("Working Shift : "+shift);
    }
}
public class Casting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Employee objEmp = new Employee(1,"Maria", 40000);
        objEmp.calCommision(20000F); // Calculate commission
        objEmp.displayDetails(); // Print the details
        System.out.println("-------------------------");

        // Instantiate the Employee object as PartTimeEmployee
        Employee objEmp1 = new PartTimeEmployee(1, "Rob Smith", 30000,"Day");
        objEmp1.displayDetails(); // Print the details
        PartTimeEmployee emp=(PartTimeEmployee)new Employee(1,"Ali",40000);

    }
    
}
