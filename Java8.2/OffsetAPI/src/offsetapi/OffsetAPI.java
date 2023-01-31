/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offsetapi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author SanaSheeraz
 */
public class OffsetAPI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         LocalDateTime datetime=LocalDateTime.of(2016, Month.FEBRUARY, 15, 18, 20);
        ZoneOffset sampleoffset=ZoneOffset.of("-07:00");
        OffsetDateTime date=OffsetDateTime.of(datetime,sampleoffset);
        System.out.println("Sample Display Of Date and Time using time-zone offset : "+date);
        
        //Offset Time
        OffsetTime d=OffsetTime.now();
        int e=d.getMinute();
        System.out.println("Minutes : "+e);
        
        OffsetTime d1=OffsetTime.ofInstant(Instant.now(),ZoneId.systemDefault());
        System.out.println(d1);
        
        //Period
        LocalDate presentday=LocalDate.now();
        LocalDate bday=LocalDate.of(1983, Month.MAY,22);
        LocalDate comingBday=bday.withYear(presentday.getYear());
        if(comingBday.isBefore(presentday)|| comingBday.isEqual(presentday))
        {
            comingBday=comingBday.plusYears(1);
        }
        Period waitA=Period.between(presentday, comingBday);
        long waitB=ChronoUnit.DAYS.between(presentday, comingBday);
        System.out.println("Totally , I need to wait for "+waitA.getMonths()+" months , and "+
                waitA.getDays()+" days to celebrate my next birthday ( "+waitB+" days in total ) ");
        
        
    }
    
}
