/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package july15;

/**
 *
 * @author Sana
 */
public class Demo {
//    public Demo()
//    {
//        System.out.println("Blank Constructor");
//    }
    
    public void test1(String msg)
    {
        System.out.println("Return Nothing Receive One Parameter : "+msg);
    }
    
     public boolean test2(int num)
    {
       if(num>0)
       {
           return true;
       }else
       {
           return false;
       }
    }
     
    public int test3(String msg)
    {
        return msg.length();
    }
}
