/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sumarray;

import java.util.Scanner;

/**
 *
 * @author sanasheeraz
 */
public class SumArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int []arr=new int [3];
        System.out.println("Enter element of an array : ");
        for(int i=0;i< arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Sum of array is : ");
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
    
}
