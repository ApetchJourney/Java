/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factorial;

import java.util.Scanner;

/**
 *
 * @author sanasheeraz
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :  ");
        int num= sc.nextInt();
        while(num>0)
        {
            fact=fact*num;
            num--;
        }
        System.out.println("Factorial is "+ fact);
    }
    
}
