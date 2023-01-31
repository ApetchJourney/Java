/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package recursion;

/**
 *
 * @author SanaSheeraz
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int a=4;
     
       int b=cal(a);
        System.out.println(b);
    }
    static int cal(int n)
    {
      
    
        if(n>=1)
        {
           return n*cal(n-1);
        }
        else{ return 1;
        }
    }
 

}
