/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dowhile;

import java.util.Scanner;

/**
 *
 * @author SanaSheeraz
 */
public class Dowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op;
        int a ,b ,ans=0;
        char c;
       
        Scanner sc=new Scanner(System.in);
       do{ 
       System.out.println("enter 1st value");
       a=sc.nextInt();
       System.out.println("enter 2nd value");
       b=sc.nextInt();
        System.out.println("enter 1 for + \n 2 for - \n3 for * \n 4 for /");
        op=sc.nextInt();
       switch(op)
       {
           case 1:
           ans=a+b;
           break;
           case 2:
           ans=a-b;
           break;
           case 3:
           ans=a*b;
           break;
           case 4:
           ans=a/b;
           break;
         
       }
        System.out.println(ans);
           System.out.println("Do you want to continue : Press 'y' or 'Y');");
           c=sc.next().charAt(0);
                  
       }while(c=='y' || c=='Y');
    }
    
}
