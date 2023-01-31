/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yearclass;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;

/**
 *
 * @author SanaSheeraz
 */
public class YearClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Present Year : "+Year.now());
        
        System.out.println("2002 is leap Year  : "+Year.isLeap(2002));
         System.out.println("2012 is leap Year  : "+Year.isLeap(2012));
         
        LocalDate sampledate=LocalDate.now();
        System.out.println("Current Date : "+sampledate);
        LocalDate nextWed=sampledate.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("Next Saturday on : "+nextWed);
    }
    
}
