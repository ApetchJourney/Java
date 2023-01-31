/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author dell
 */
public class DateApi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate localdate=LocalDate.now();
        System.out.println("Local Date : "+localdate);
        
        LocalDate localDate=LocalDate.of(2017, Month.MARCH, 3);
         System.out.println("Local Date Of : "+localDate);
         
        int year=localdate.getYear();
        System.out.println("Year : "+year);
     
        Month month=localdate.getMonth();
        System.out.println("Month : "+month);
        
        int DayOfMonth=localdate.getDayOfMonth();
        System.out.println("Day Of Month : "+DayOfMonth);
        
        long DayOfYear=localdate.getDayOfYear();
        System.out.println("Day Of Year : "+DayOfYear);
        
        DayOfWeek dayOfWeek=localdate.getDayOfWeek();
        System.out.println("Day Of Week : "+dayOfWeek);
        
        int monthvalue=month.getValue();
        System.out.println("Month Value : "+monthvalue);
        
        System.out.println("Future : "+localdate.plusYears(4));
        System.out.println("Future : "+localdate.plusMonths(4));
        System.out.println("Future : "+localdate.plusDays(4));
        
    }
    
}
