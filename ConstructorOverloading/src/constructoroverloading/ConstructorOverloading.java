/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package constructoroverloading;

/**
 *
 * @author sanasheeraz
 */
class Student
{
    int rollNo;
    String name;
    String address;
    float marks;
     
    Student()
     {
          rollNo = 0;
          name = "";
          address = "";        
          marks = 0; 
     }
    Student(int rNo, String sname) 
    {        
        rollNo = rNo;
         name = sname;
    }      
    Student(int rNo, float score) 
    {       
        rollNo = rNo;      
        marks = score;   
    } 
    Student(String sName, String addr) 
    {                
        name = sName;       
        address = addr;   
    } 
     Student(int rNo, String sname, float score) 
     {           
         rollNo = rNo;       
         name = sname;       
         marks = score;    
     }  
      public void displayDetails()
      {           
          System.out.println("Rollno :"+ rollNo);       
          System.out.println("Student name:"+ name);       
          System.out.println("Address "+ address);      
          System.out.println("Score "+ marks);       
          System.out.println("------------------------");    
      } 
}
public class ConstructorOverloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Student objStud1 = new Student("David","302, Washington Street");
          objStud1.displayDetails(); 
          Student objStud2 = new Student(103, 46);  
          objStud2.displayDetails();        
          Student objStud3 = new Student(104, "Roger", 50);  
          objStud3.displayDetails(); 
    }
    
}
