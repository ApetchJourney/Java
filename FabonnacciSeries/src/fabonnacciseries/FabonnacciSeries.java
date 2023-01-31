/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fabonnacciseries;

import java.util.Scanner;

/**
 *
 * @author sanasheeraz
 */
public class FabonnacciSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println("Fabonacci Series : ");
        fab(num);
    }
    static void fab(int n)
    {
       int n1=0 , n2=1;
        System.out.println(n1+"\n"+n2);
        for (int i=0 ; i<n ; i++)
        {
            int ans = n1+n2;
            System.out.println(ans);
            n1=n2;
            n2=ans;
        }
    }
    
}
