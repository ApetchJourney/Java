/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydemo;

import java.util.Scanner;

/**
 *
 * @author Sana
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        int arr1[]=new int[5];
        arr1[0]=11;
        arr1[1]=12;
        arr1[2]=13;
        arr1[3]=14;
        arr1[4]=15;
        int arr2[]=new int[5];
        System.out.println("Enter Elements of an array :");
        /*arr2[0]=sc.nextInt();
        arr2[1]=sc.nextInt();
        arr2[2]=sc.nextInt();
        arr2[3]=sc.nextInt();
        arr2[4]=sc.nextInt();
        
        for(int i=0;i<5;i++)
            arr2[i]=sc.nextInt();
        
        
        System.out.println("Array arr :");
        for(int i=0;i<5;i++)
        System.out.println(arr[i]);
        
        System.out.println("Array arr1 :");
        for(int i=0;i<5;i++)
        System.out.println(arr1[i]);
        
        System.out.println("Array User Input arr2 :");
        for(int i=0;i<5;i++)
        System.out.println(arr2[i]);
        */
        
        OneDimension one=new OneDimension();
        one.storeMarks();
        one.displayMarks();
        
    }
    
}
