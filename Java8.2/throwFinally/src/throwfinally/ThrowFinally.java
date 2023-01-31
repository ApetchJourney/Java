/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throwfinally;

import java.util.Scanner;

/**
 *
 * @author Sana
 */
public class ThrowFinally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int age;
        Scanner sc=new Scanner(System.in);
        try
        {
            age=sc.nextInt();
            if(age>=18)
            {
                System.out.println("Actual Logic ");
            }else
            {
                throw new RuntimeException("Not Allowed !");
            }
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
           // System.out.println("Not Allowed For Less 18");
        }finally
        {
            System.out.println("Thank you For using My Application");
        }
    }
    
}
