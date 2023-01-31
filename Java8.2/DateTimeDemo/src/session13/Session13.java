/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session13;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.Date;

/**
 *
 * @author Sana
 */
public class Session13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Clock zone=Clock.systemDefaultZone();
        System.out.println(zone);
        
        LocalTime time=LocalTime.now();
        LocalTime time1=LocalTime.of(4, 30, 12);
        
        System.out.println("Time : "+time);
        System.out.println("Time1 : "+time1);
        
        Duration d=Duration.between(time, time1);
        System.out.println("Duration : "+d);
        
        
        Duration duration=Duration.ofDays(4);
        System.out.println("Duration :"+duration.toMinutes());
        
        System.out.println("Add 8 hours : "+time.plusHours(8));
        
        System.out.println(time.plusMinutes(120));
        
        LocalDate date=LocalDate.of(2024, Month.FEBRUARY, 27);
        System.out.println(date.plusDays(5));
        
        System.out.println("Day of week : "+date.getDayOfWeek()); //tuesday
        System.out.println("Day of Month : "+date.getDayOfMonth());
        System.out.println("Day of Year : "+LocalDate.now().getDayOfYear());
        
        
    }
    
}
