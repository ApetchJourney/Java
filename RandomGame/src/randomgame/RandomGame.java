/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomgame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Sana
 */
public class RandomGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random=new Random();
        int a=random.nextInt(10);
        System.out.println("Enter any number: ");
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        if(a==b)
        {
            System.out.println("You Won !");
        }else
        {
            System.out.println("Try Again");
        }
    }
    
}
