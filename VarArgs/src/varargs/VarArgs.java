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
class variable
{
     public void addNumber(int...num) {         
         int sum=0;                
         for(int i:num) {                   
             sum = sum + i;        
         }           
     System.out.println("Sum of numbers is "+ sum);   
     } 
}
public class VarArgs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        variable obj = new variable();        
        obj.addNumber(10,30,40);
        Variable1 obj1=new Variable1();
        obj1.addNumber1(34,65,12);
    }
    
}
