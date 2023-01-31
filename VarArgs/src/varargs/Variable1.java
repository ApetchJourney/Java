/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package varargs;

/**
 *
 * @author SanaSheeraz
 */
public class Variable1 {
    public void addNumber1(int...num) {         
         int sum=0;                
         for(int i:num) {                   
             sum = sum + i;        
         }           
     System.out.println("Sum of numbers is "+ sum);   
     } 
}
