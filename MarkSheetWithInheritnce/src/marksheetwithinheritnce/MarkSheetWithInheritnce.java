/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package marksheetwithinheritnce;

import java.util.Scanner;

/**
 *
 * @author SanaSheeraz
 */
class Clg{
    String name;
    String f_name;
    int age;
    String faculty;
}
class Student extends Clg{
    int English;
    int Maths;
    int Computer;
    int Physics;
    int Urdu;
   
    void marks(){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter your English marks:");
       English=sc.nextInt();
       System.out.println("Enter your Maths marks:");
       Maths=sc.nextInt();
       System.out.println("Enter your Computer marks:");
       Computer=sc.nextInt();
       System.out.println("Enter your Physics marks:");
       Physics=sc.nextInt();
       System.out.println("Enter your Urdu marks:");
       Urdu=sc.nextInt();     
    }
    void cal(){
        int total=500;
        int per;
        int obt=English+Maths+Computer+Physics+Urdu;
        per=obt*100/total;
        System.out.println("Total Marks ="+obt);
        System.out.println("Percentage ="+per);
        if(per>=80){
            System.out.println("Grade = A+");
        }
        if(per>=70 && per<80){
            System.out.println("Grade = B");
            }
        if(per>=60 && per<70){
            System.out.println("Grade = C");
                }
        if(per>=50 && per<60){
            System.out.println("Grade = D");
        }
    }
}
public class MarkSheetWithInheritnce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student obj=new Student();
        System.out.println("Enter your Name");
        Scanner sc=new Scanner(System.in);
        obj.name=sc.next();
        System.out.println("Enter your Father name:");
        obj.f_name=sc.next();
        System.out.println("Enter your Faculty name:");
        obj.faculty=sc.next();
        System.out.println("Enter your age:");
        obj.age=sc.nextInt();
        Student obj1=new Student();
      
        obj.marks();
          System.out.println("Subjects\tTotalMarks\tObtainedMarks");
        System.out.println("English\t100\t"+obj.English);
        System.out.println("Maths\t100\t"+obj.Maths);
        System.out.println("Computer\t100\t"+obj.Computer);
        System.out.println("Physics\t100\t"+obj.Physics);
        System.out.println("Urdu\t100\t"+obj.Urdu);
        obj.cal();
    }
    
}
