/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author Sana
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int eng,maths,urdu,isl,com;
        int total;
        int per=0;
        char grade;
        char ch;
        do{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Enter your College name:");
        String Cname=sc.nextLine();
          System.out.println("enter your enrolment no:");
        int Enum;
        Enum = sc.nextInt();
        System.out.println("enter your english marks out of 100:");
        eng=sc.nextInt();
         System.out.println("enter your urdu marks out of 100:");
       urdu=sc.nextInt();
        System.out.println("enter your maths marks out of 100:");
        maths=sc.nextInt();
         System.out.println("enter your islamiat marks out of 100:");
        isl=sc.nextInt();
         System.out.println("enter your computer marks out of 100:");
        com=sc.nextInt();
        System.out.println("\nyour name:"+name);
         System.out.println("your College name:"+Cname);
          System.out.println("your enrolment no:"+Enum);
        System.out.println("Subjects \t TotalMarks \t ObtainedMarks");
        System.out.println("\n English\t 100\t\t"+eng );
        System.out.println("\n Urdu\t\t100\t\t"+urdu );
        System.out.println("\n Maths\t\t 100\t\t"+maths );
        System.out.println("\n Islamiat\t 100\t\t"+isl );
        System.out.println("\n Computer\t 100\t\t"+com );
        total=eng+urdu+maths+isl+com;
        System.out.println(name+ "Your total marks are "+total);
        per=total*100/500;
        System.out.println(name+ "your percentage is" +per+"%");
        if(per>=80)
        System.out.println(name+ "your grade is A\n");
        else if(per>=70)
            System.out.println(name+ "your grade is B\n");
        else if(per>=60)
            System.out.println(name+ "your grade is C\n");
        else if(per>=50)
            System.out.println(name+ "your grade is D\n");
        else
        {System.out.println(name+"u r fail\n");}
        System.out.println("do u want to get another result? y/n:");
         ch=sc.next().charAt(0);
    }
        while(ch == 'Y' || ch=='y');
        System.out.println("Thank u for coming !");
    }
    
}
