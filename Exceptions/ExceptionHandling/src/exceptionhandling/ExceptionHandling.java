/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exceptionhandling;

import java.util.Scanner;

/**
 *
 * @author SanaSheeraz
 */
public class ExceptionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number: ");
       try{
            int a=sc.nextInt();
            int b=23/a;
            System.out.println(b);
       }catch(Exception e){
            System.out.println(e);
       }
    }
    
}
