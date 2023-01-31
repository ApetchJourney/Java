/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayinclasses;

import java.util.Scanner;

/**
 *
 * @author Sana
 */
class Student
{
    String[] Name;
    int[] DOA;
    int[] MOA;
    int[] YOA;
    int[] DOB;
    int[] MOB;
    int[] YOB;
    
    Student(int no)
    {
        Name=new String[no];
        DOA=new int[no];
        MOA=new int[no];
        YOA=new int[no];
        DOB=new int[no];
        MOB=new int[no];
        YOB=new int[no];
    }
    
    int calAge(int YOB)
    {
        int CY=2019;
        int age=CY-YOB;
        return age;
    }
    String Vote(int age)
    {
        if(age>=18)
        {
            return "eligible";
        }else
        {
            return "not eligible";
        }
    }
}
public class ArrayInClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of Students : ");
        int no=sc.nextInt();
        Student student=new Student(no);
        for(int i=0;i<no;i++)
        {
            System.out.println("Enter name of Student : ");
            student.Name[i]=sc.next();
            System.out.println("Enter Date of Admission : ");
            student.DOA[i]=sc.nextInt();
            System.out.println("Enter Month of Admission : ");
            student.MOA[i]=sc.nextInt();
            System.out.println("Enter Year of Admission : ");
            student.YOA[i]=sc.nextInt();
            System.out.println("Enter Date of Birth : ");
            student.DOB[i]=sc.nextInt();
            System.out.println("Enter Month of Birth : ");
            student.MOB[i]=sc.nextInt();
            System.out.println("Enter Year of Birth : ");
            student.YOB[i]=sc.nextInt();
        }
        System.out.println("Name \t\t DOA \t\t DOB \t\t Age \t Vote");
        for(int i=0;i<no;i++)
        {
            System.out.println(student.Name[i]+"\t\t"+
                    student.DOA[i]+"-"+student.MOA[i]+"-"+student.YOA[i]+"\t"+
                    student.DOB[i]+"-"+student.MOB[i]+"-"+student.YOB[i]+"\t"+
                    student.calAge(student.YOB[i])+"\t"+student.Vote(student.calAge(student.YOB[i])));
        }
    }
    
}
