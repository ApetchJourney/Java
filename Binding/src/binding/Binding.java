/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binding;

/**
 *
 * @author SanaSheeraz
 */
class Employee
{
    String empId; // Variable to store employee ID
    String empName; // Variable to store employee name
    int salary; // Variable to store salary
    float commission; // Variable to store commission
    public Employee(String id, String name, int sal)
    {
        empId=id;
        empName=name;
        salary=sal;
    }
    public void calcCommission(float sales)
    {
        if(sales > 10000)
        commission = salary * 20 / 100;
        else
        commission=0;
    }
    public void calcCommission(int overtime)
    {
        if(overtime > 8)
        commission = salary/30;
        else
        commission = 0;
    }
    public void displayDetails()
    {
        System.out.println("Employee ID:"+empId);
        System.out.println("Employee Name:"+empName);
        System.out.println("Salary:"+salary);
        System.out.println("Commission:"+commission);
    }
}
public class Binding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee objEmp = new Employee("E001","Maria Nemeth", 40000);
        objEmp.calcCommission(20000F);
        objEmp.displayDetails(); // Print the employee details
    }
    
}
