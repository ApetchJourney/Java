/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritance1;

import java.util.Scanner;

/**
 *
 * @author SanaSheeraz
 */
 class Product{
        String name;
        int price;
        float weight;
        int prod_id;
        int sell_prod;
    }
    class Company extends Product{
        String company_name;
        int total_product , sell_product;
        String Address;
       void cal(){
           int total=total_product-sell_product;
           int ans=total*100/total_product;
           System.out.println("sell of the month is "+ans);
       } 
    }
public class Inheritance1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Company obj=new Company();
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Name of Company");
        obj.company_name=sc.nextLine();
        System.out.println("Enter Product Name");
        obj.name=sc.nextLine();
        System.out.println("Enter Product Price");
        obj.price=sc.nextInt();
        System.out.println("Enter Product Weight");
        obj.weight=sc.nextFloat();
        System.out.println("Enter Product ID");
        obj.prod_id=sc.nextInt();
        System.out.println("Enter Sell Product");
        obj.sell_product=sc.nextInt();
        System.out.println("Enter Total Product");
        obj.total_product=sc.nextInt();
        obj.cal();
    }
    
}
