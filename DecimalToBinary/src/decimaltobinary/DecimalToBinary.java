/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package decimaltobinary;

import java.util.Scanner;

/**
 *
 * @author sanasheeraz
 */
public class DecimalToBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter number : ");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        dtb(num);
    }
    static void dtb(int n)
    {
        while(n!=0)
        {
        int num=n%2;
            System.out.print(num);
            n=n/2;
        }
    }
    
}
