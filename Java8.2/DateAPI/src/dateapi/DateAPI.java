/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateapi;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.*;

/**
 *
 * @author SanaSheeraz
 */
public class DateAPI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
//        LocalDate date=LocalDate.now();
//        System.out.println("Date : "+date);
//        System.out.println("Date after Four days : "+date.plusDays(6));
        
//        LocalDate obj = LocalDate.of(1997, Month.JANUARY, 8);
//		System.out.println("Current Date="+obj);
		
		//Creating LocalDate by providing input arguments
//		LocalDate firstDay_2014 = LocalDate.of(2014, Month.JANUARY, 32);
//		System.out.println("Specific Date="+firstDay_2014);
		
		
		//Try creating date by providing invalid inputs
		//LocalDate feb29_2014 = LocalDate.of(2014, Month.FEBRUARY, 29);
		//Exception in thread "main" java.time.DateTimeException: 
		//Invalid date 'February 29' as '2014' is not a leap year
		
		//Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
//		LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
//		System.out.println("Current Date in IST="+todayKolkata);
////
////		//java.time.zone.ZoneRulesException: Unknown time-zone ID: IST
//                //LocalDate todayIST = LocalDate.now(ZoneId.of("IST"));
////		
////		//Getting date from the base date i.e 01/01/1970
//		LocalDate dateFromBase = LocalDate.ofEpochDay(345);
//		System.out.println("365th day from base date= "+dateFromBase);
////		
//		LocalDate hundredDay2014 = LocalDate.ofYearDay(2014, 100);
//		System.out.println("100th day of 2014="+hundredDay2014);
    }
    
}
