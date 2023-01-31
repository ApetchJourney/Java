/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritance3;

import java.util.Scanner;

/**
 *
 * @author SanaSheeraz
 */
class Student{
    String[] Name=new String[2];
    int[] age=new int[2];
    String[] NOD=new String[2];
    
    
}
class clg extends Student{
    void Record()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<Name.length;i++)
        {
            System.out.println("Enter Name of student"+i);
            Name[i]=sc.next();
            System.out.println("Enter age of student"+i);
            age[i]=sc.nextInt();
            System.out.println("Enter Name of dapartmaent"+i);
            NOD[i]=sc.next();
            
        }
    }
        void print()
        {
               System.out.println("Name\tage\tdegree");
               for(int i=0;i<Name.length;i++)
               {
                 System.out.println(Name[i]+"\t"+age[i]+"\t"+NOD[i]);
               }          
        }
    }
public class Inheritance3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        clg obj=new clg();
        obj.Record();
        obj.print();
    }
    
}
