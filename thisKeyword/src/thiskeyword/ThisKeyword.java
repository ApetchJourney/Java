/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thiskeyword;

/**
 *
 * @author SanaSheeraz
 */
class Account
{
    int a;
    int b;
    public void setData(int a,int b)
    {
     this.a=a;
      this.b=b;
    }
    public void showData()
    {
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
    }
}
public class ThisKeyword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account obj=new Account();
        obj.setData(2,3);
        obj.showData();

    Account obj1=new Account();
    obj1.setData(3,4);
    obj1.showData();
    }
    
}
