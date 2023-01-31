/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mart;

import java.util.Scanner;

/**
 *
 * @author SanaSheeraz
 */
class bill
{
    String[] pro_name= new String [10];
    int[] pro_price=new int[10];
    int[] pro_quantity=new int[10];
    int total=0;
    Scanner sc=new Scanner(System.in);
    
    void create_bill(int n)
    {
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter Name of Product " +i+":");
            pro_name[i]=sc.next();
            System.out.println("Enter Price of Product " +i+":");
            pro_price[i]=sc.nextInt();
            System.out.println("Enter Quantity of Product " +i+":");
            pro_quantity[i]=sc.nextInt();
            total=total+pro_price[i]*pro_quantity[i];
        }
        System.out.println("Name \t Price \t Quantity  ");
        for(int i=1;i<=n;i++)
        {
            System.out.println(""+pro_name[i]+"\t"+pro_price[i]+"\t"+pro_quantity[i]);
        }
        System.out.println("Total : "+total);
    }
}
public class Mart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=0;
        System.out.println("Enter Number Of Product : ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        bill obj=new bill();
        obj.create_bill(num);
    }
    
}
