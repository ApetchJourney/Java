/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication92;

import java.util.Scanner;

/**
 *
 * @author SanaSheeraz
 */
public class JavaApplication92 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("enter a number:");
        Scanner sc=new Scanner(System.in);
        try
        {
            
            int a=sc.nextInt();
            int b=25/a;
            
            int s=0;
            System.out.println(b);
            int []arr=new int[10];
            arr[a]=s;
            System.out.println("enter number of array");
           // s=sc.nextInt();
        for(int i=0;i<=15;i++)
        {
            
            arr[i]=sc.nextInt();
            
        }
        }
        
        catch(ArithmeticException e)
        {
            System.out.println("divided by zero \n"+e);   
        }
        
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("out of bound \n"+e);
        }
        
        catch(Exception e)
        {
            System.out.println("other exception \n"+e);
        }
    }
    
}
