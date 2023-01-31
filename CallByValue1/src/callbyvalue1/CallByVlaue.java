/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package callbyvlaue;

/**
 *
 * @author sanasheeraz
 */
public class CallByVlaue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=2 ,b=3;
        int c=func(a,b);
        System.out.println(a+"\n"+b+"\n"+c);
    }
    static int func(int a, int b)
    {
        a=a*2;
        b=b*3;
        return a;
    }
    
}
