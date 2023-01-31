/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package primenumber;

import java.util.Scanner;

/**
 *
 * @author sanasheeraz
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean isPrime=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number to check :  ");
        int num= sc.nextInt();
        for(int i=2 ; i<num ; i++)
        {
            if(num%i==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime==true)
        {
            System.out.println(num + " is Prime ");
        }else
        {
            System.out.println(num + " is not Prime");
        }
    }
    
}
