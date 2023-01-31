/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package searcharray;

import java.util.Scanner;

/**
 *
 * @author sanasheeraz
 */
public class Searcharray {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int count=0;
        int []arr={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num you want to search : ");
        num=sc.nextInt();
        for(int i=0;i<arr.length ; i++)
        {
         if(arr[i]==num)
         {
             System.out.println("Number found");
             count++;
             break;
             
         }
        }
        if(count==0)
        {
            System.out.println("Number not found");
        }
        
    }
    
}
