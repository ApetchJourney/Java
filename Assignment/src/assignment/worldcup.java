/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author Dell Inspiron 5567
 */
public class worldcup extends games{
double bonus;
double salary;

    /**
     *
     * @param performance
     * @param grade
     * @return
     */
    @Override
    public double bonus(String performance, String grade) {
       if (performance=="best" && grade=="A"){
            bonus=15000;
           System.out.println("your bonus is : "+bonus);
       }
        else if((performance=="average")&&(grade=="A")){
           bonus=13000;
           System.out.println("your bonus is : "+bonus);
       }
       else if((performance=="average")&&(grade=="A")){
           bonus=11000;
           System.out.println("your bonus is : "+bonus);
       }
       else if((performance=="best")&&(grade=="B")){
           bonus=13000;
           System.out.println("your bonus is : "+bonus);
       }
       else if((performance=="good")&&(grade=="B")){
           bonus=11000;
           System.out.println("your bonus is : "+bonus);
       }
       else if((performance=="average")&&(grade=="B")){
           bonus=9000;
           System.out.println("your bonus is : "+bonus);
       }
       else if((performance=="best")&&(grade=="C")){
           bonus=11000;
           System.out.println("your bonus is : "+bonus);
       }
       else if((performance=="good")&&(grade=="C")){
           bonus=9000;
           System.out.println("your bonus is : "+bonus);
       }
       else if((performance=="average")&&(grade=="C")){
           bonus=7000;
           System.out.println("your bonus is : "+bonus);
       }
       else{
           System.out.println("wrong input ");}
      
       
       
       return bonus;
    }

    @Override
    public double calculateincome(int numgames) {
       
           salary=(numgames*20000)+bonus;
           System.out.println("your salary is : "+salary);
       
       return salary;
    }
    
}
