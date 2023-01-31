/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package overloading;

/**
 *
 * @author sanasheeraz
 */
class Calculator
{
    void Add(int a, int b)
    {
        int ans=a+b;
        System.out.println(ans);
    }
    /*void Add(int a,double b)
    {
        double ans=a+b;
    }*/
    void Add(int a, int b, int c)
    {
        int ans=a+b+c;
        System.out.println(ans);
    }
}
public class Overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator obj=new Calculator();
       obj.Add(2, 3);
       obj.Add(2, 3, 4);
        
    }
    
}
