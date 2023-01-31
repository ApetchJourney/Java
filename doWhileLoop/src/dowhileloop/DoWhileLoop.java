/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhileloop;

import java.util.Scanner;

/**
 *
 * @author Sana
 */
public class DoWhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int item,quantity;
        char ch;
        float price=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Item No \t Items \t\t Price");
        System.out.println("1 \t\t Milk \t\t 50");
        System.out.println("2 \t\t Chocolate \t 20");
        System.out.println("3 \t\t Biscuit \t 40");
        System.out.println("4 \t\t Butter \t 60");
        System.out.println("5 \t\t Bread \t\t 30");
        do{
        System.out.println("Enter Item No : ");
        item=sc.nextInt();
        System.out.println("Enter Quantity : ");
        quantity=sc.nextInt();
        switch(item)
        {
            case 1:
                price+=50*quantity;
                break;
            case 2:
                price+=20*quantity;
                break;
            case 3:
                price+=40*quantity;
                break;
            case 4:
                price+=60*quantity;
                break;
            case 5:
                price+=30*quantity;
                break;
            default:
                System.out.println("Invalid Item Number !");
        }
        System.out.println("Do you want to Purchase more items(Y/N) ? ");
        ch=sc.next().charAt(0);
        }while(ch=='y'||ch=='Y');
        System.out.println("Total price : "+price);
    }
    
}
