/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author sanasheeraz
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Enter First Number : ");
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b= sc.nextInt();
        System.out.println("Enter Operator: ");
        char c= sc.next().charAt(0);
        switch(c)
        {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("invalid operator");
        }
    }
    
}
