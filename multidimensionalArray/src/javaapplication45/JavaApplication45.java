/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication45;

import java.util.Scanner;

/**
 *
 * @author SanaSheeraz
 */
public class JavaApplication45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] arr={{1,2},{3,4},{5,6},{7,8},{9,10}};
        int[][] arr1=new int[2][3];
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<2;j++)
            {
              System.out.println("Value at index "+i+j+" : "+arr[i][j]);  
            }
        }
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                System.out.println("Enter value at ["+i+"] ["+j+"]");
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
              System.out.println("Value at index "+i+j+" : "+arr1[i][j]);  
            }
        }
        System.out.println(""+arr1.length);
    }
    
}
