/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package overridden;

/**
 *
 * @author SanaSheeraz
 */
class companyA{
    int a=10 ,b=20, c=30;
    void cal(){
       int d = a+b+c;
        System.out.println(d);
    }
}
class companyB extends companyA
{
    @Override
    void cal()
    {
       int d = a*b*c;
        System.out.println(d);
    }
}
class companyC extends companyB{
    @Override
    void cal()
    {
       int d = a-b-c;
        System.out.println(d);
    }
}
public class Overridden {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        companyC c=new companyC();
        companyB b=new companyB();
        companyA a=new companyA();
        c.cal();
        b.cal();
        a.cal();
    }
    
}
