/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cricket;

/**
 *
 * @author Dell Inspiron 5567
 */
public class testmatch extends games{
double bonus;
double salary;
    @Override
    public double bonus(String performance, String grade) {
        if((performance=="best")&&(grade=="A")){
            bonus=10000;
            System.out.println("your bonus is : "+bonus);
        }
        else if((performance=="good")&&(grade=="A")){
            bonus=8000;
             System.out.println("your bonus is : "+bonus);
        }
        else if((performance=="average")&&(grade=="A")){
            bonus=6000;
             System.out.println("your bonus is : "+bonus);
        }
        else if((performance=="best")&&(grade=="B")){
            bonus=8000;
             System.out.println("your bonus is : "+bonus);
        }
        else if((performance=="good")&&(grade=="B")){
            bonus=6000;
             System.out.println("your bonus is : "+bonus);
        }
        else if((performance=="average")&&(grade=="B")){
            bonus=4000;
             System.out.println("your bonus is : "+bonus);
        }
        else if((performance=="best")&&(grade=="C")){
            bonus=6000;
             System.out.println("your bonus is : "+bonus);
        }
        else if((performance=="good")&&(grade=="C")){
            bonus=4000;
             System.out.println("your bonus is : "+bonus);
        }
        else if((performance=="average")&&(grade=="C")){
            bonus=3000;
             System.out.println("your bonus is : "+bonus);
        }
         else{
            System.out.println("wrong input");
        }
        return bonus;
    }

    @Override
    public double calculateincome(int numgames) {
      
           salary=(numgames*25000)+bonus;
            System.out.println("your salary is : "+salary);
       return salary;
    }
    
}
