/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheitance;

import java.util.Scanner;

/**
 *
 * @author Sana
 */
class Student{
  int id;
  String Name;
  int age;
  String course;
}
class College extends Student
{
    Scanner sc=new Scanner(System.in);
    void Record()
    {
        System.out.println("Enter id : ");
        id=sc.nextInt();
        System.out.println("Enter your Name : ");
        Name=sc.next();
        System.out.println("Enter age : ");
        age=sc.nextInt();
        System.out.println("Enter course : ");
        course=sc.next();
    }
    
    void print()
    {
        System.out.println("Student's Data ");
        System.out.println("Id : "+id);
        System.out.println("Name : "+Name);
        System.out.println("Age : "+age);
        System.out.println("Course : "+course);
    }
}
public class Inheitance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        College clg=new College();
        College clg1=new College();
        clg.Record();
        clg1.Record();
        clg1.print();
        clg.print();
    }
    
}
