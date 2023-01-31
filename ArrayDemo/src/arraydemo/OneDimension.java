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
public class OneDimension {
    int marks[]=new int[5];
    
    void storeMarks()
    {
        System.out.println("Enter Marks : ");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
            marks[i]=sc.nextInt();
    }
    
    void displayMarks()
    {
        for(int i=0;i<5;i++)
            System.out.println("At index "+i+marks[i]);
    }
}
