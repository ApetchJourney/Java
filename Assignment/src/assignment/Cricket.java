/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricket;

import java.util.Scanner;

/**
 *
 * @author Dell Inspiron 5567
 */
public class Cricket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        games obj;
        String match;
        System.out.println("enter match (world cup) or(test match ) ");
        Scanner sc=new Scanner (System.in);
        match=sc.nextLine();
        switch(match){
            case "WorldCup":
                obj=new worldcup();
                Scanner sd=new Scanner (System.in);
                System.out.println("enter number of matches ");
                 int numgames=sd.nextInt();
                 System.out.println("enter your grade : ");
                String grade=sd.next();
                System.out.println("enter your performance :");
                String performance=sd.next();
                obj.bonus(performance, grade);
                obj.calculateincome(numgames);
                break;
                  case "Testmatch":
                obj=new testmatch();
                Scanner sj=new Scanner (System.in);
                System.out.println("enter number of matches ");
                  numgames=sj.nextInt();
                 System.out.println("enter your grade : ");
                 grade=sj.next();
                System.out.println("enter your performance :");
                performance=sj.next();
                obj.bonus(performance, grade);
                obj.calculateincome(numgames);
                break;
                  default:
                      System.out.println("wrong input");
        }
        
       player obj2=new player("farhan",8);
       obj2.displayinfo();
    }
    
}
