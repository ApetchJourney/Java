/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exceptionhandling1;

import java.util.Scanner;

/**
 *
 * @author SanaSheeraz
 */
public class ExceptionHandling1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter Numbers:");
        Scanner sc=new Scanner(System.in);
        try{
            int a =sc.nextInt();
            int b=23/a;
            int[]arr=new int[20];
            arr[a]=b;
        }catch(ArithmeticException e){
        System.out.println("divided by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("out of bound");
        }
        catch(Exception e){
            System.out.println("other exception");
        }
    }
    
}
