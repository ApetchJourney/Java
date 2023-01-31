/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication26;

/**
 *
 * @author sanasheeraz
 */
class Student
{
    String name="Ali";
    int id=21;
    String email="ali@gmail.com";
}
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student student=new Student();
        student.name="Anas";
        System.out.println("Student name : " + student.name);
        System.out.println("Student id : " + student.id);
        System.out.println("Student email : " + student.email);
        Student student1=new Student();
        student1.name="Abdullah";
        student1.id=34;
        student1.email="abdullah@gmail.com";
        System.out.println(student1.name);
        System.out.println(student1.id);
        System.out.println(student1.email);
    }
    
}
