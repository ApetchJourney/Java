/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package defaultconstructor;

/**
 *
 * @author sanasheeraz
 */
class Employee{
    String employeeName;
    int employeeAge;
    double employeeSalary;
    boolean maritalStatus;
    void displayEmployeeDetails()
    {
        System.out.println("Employee Details:");
        System.out.println("==================");
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Age: " + employeeAge);
        System.out.println("Employee Salary: " + employeeSalary);
        System.out.println("Employee MaritalStatus: " + maritalStatus);
    }
 
}
public class DefaultConstructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Instantiates an Employee object and initializes it
        Employee objEmp = new Employee();

 // Invokes the displayEmployeeDetails() method
         objEmp.displayEmployeeDetails();
    }
    
}
