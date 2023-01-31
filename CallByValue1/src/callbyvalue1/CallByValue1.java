/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package callbyvalue1;

/**
 *
 * @author sanasheeraz
 */
class Test
{
    int a, b;
    Test(int i, int j)
    {
        a=i;
        b=j;
    }
    void mul()
    {
        int ans=a*b;
        System.out.println(ans);
    }
}
public class CallByValue1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test obj= new Test(1,2);
        Test obj1=new Test(3,4);
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        obj.mul();
    }
    
}
