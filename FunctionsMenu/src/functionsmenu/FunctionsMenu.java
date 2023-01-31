/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionsmenu;

import java.util.Scanner;

/**
 *
 * @author Sana
 */
public class FunctionsMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("******** Menu ********");
        System.out.println("1. Check Prime or not");
        System.out.println("2. Check Even or Odd");
        System.out.println("3. Calculate power");
        System.out.println("4. Calculate factorial");
        System.out.println("5. Calculate Fabonacci Series");
        System.out.println("6. Exit");
        System.out.println("Enter your Choice : ");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                PrimeOrNot();
                break;
            case 2:
                EvenOrOdd();
                break;
            case 3:
                Power();
                break;
            case 4:
                Factorial();
                break;
            case 5:
                FabonacciSeries();
                break;
            case 6:
                System.out.println("Thank you for Coming .. Have a good day");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    
    public static void PrimeOrNot()
    {
        int num;
        int count =0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check it is prime or not:");
        num=sc.nextInt();
        for(int i=num-1;i>1;i--)
        {
            if(num%i==0)
                count++;
        }
        if(count==0)
        {
            System.out.println("Given Number is Prime ");
        }else
        {
            System.out.println("Given number is not Prime");
        }
    }
    public static void EvenOrOdd()
    {
        Scanner sc=new Scanner(System.in);
    }
    public static void Power()
    {
        Scanner sc=new Scanner(System.in);
        int base,power;
        int ans=1;
        System.out.println("Enter Base :");
        base=sc.nextInt();
        System.out.println("Enter Power :");
        power=sc.nextInt();
        while(power>=1)
        {
            ans=ans*base;
            power--;
        }
        System.out.println("Power is : "+ans);
    }
    public static void Factorial()
    {
        Scanner sc=new Scanner(System.in);
        
    }
    public static void FabonacciSeries()
    {
        Scanner sc=new Scanner(System.in);
    }
}
