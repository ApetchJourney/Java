/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodreferencedemo;

/**
 *
 * @author Sana
 */
public class Test {
    public int Method1(int a)
    {
        //System.out.println("Instance Method : "+a);
        return a;
    }
    public static int StaticMethod(int a)
    {
        System.out.println("Static Method : "+a);
        return 7;
    }
}
