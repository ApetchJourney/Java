/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistdemo;

import java.util.ArrayList;

/**
 *
 * @author Sana
 */
class Student
{
    int id;
    String name;
    String email;
}
public class ArrayListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList marks=new ArrayList();
        ArrayList<Student> stList=new ArrayList<Student>();
        Student std=new Student();
        std.id=34;
        std.name="Adil";
        std.email="adil@gmail.com";
        Student std1=new Student();
        std1.id=35;
        std1.name="sufiyan";
        std1.email="sufiyan@gmail.com";
        stList.add(std);
        stList.add(std1);
        
        marks.add(100);
        marks.add(200);
        marks.add(300);
        
        for(Object i:marks)
        {
            System.out.println("Marks : "+i);
        }
        for(Student s:stList)
        {
            System.out.println("Student ID : "+s.id);
            System.out.println("Student Name : "+s.name);
            System.out.println("Student Email : "+s.email);
        }
        
    }
    
}
