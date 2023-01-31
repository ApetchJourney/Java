/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetimedemo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 *
 * @author Sana
 */
public class DateTimeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate sampleDate=LocalDate.now();
        System.out.println("Today : "+sampleDate);
        System.out.println("Next MONDAY : "+sampleDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY)));
        System.out.println("Next MONDAY : "+sampleDate.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));
    }
    
}
