/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrome;

import java.util.Scanner;

/**
 *
 * @author SanaSheeraz
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,num1,num2,num3,num4,num5;
        int rem1,rem2,rem3,rem4,rem5;
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        rem1=num%10;
        num1=num/10;
        rem2=num1%10;
        num2=num1/10;
        rem3=num2%10;
        num3=num2/10;
        rem4=num3%10;
        num4=num3/10;
        rem5=num4%10;
        num5=num4/10;
        if(rem1==rem5||rem2==rem4){     
            System.out.println("It's a Palindrome");
        }
        else
            System.out.println("It's not a Palindrome");

    }
    
}
