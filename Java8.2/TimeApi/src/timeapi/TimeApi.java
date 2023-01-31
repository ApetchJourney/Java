/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;

/**
 *
 * @author dell
 */
public class TimeApi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate today=LocalDate.now();
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println("Local Date And Time : "+localDateTime);
        System.out.println("hour : "+localDateTime.getHour());
        System.out.println("Day of Year : "+localDateTime.getDayOfYear());
        System.out.println("Day of Month : "+localDateTime.getDayOfMonth());
        
        System.out.println("Day of Week : "+localDateTime.getDayOfWeek());
        LocalDate anasBday=LocalDate.of(2000, Month.JANUARY,12);
        
        System.out.println("Day after four years :"+anasBday.of(2023,Month.JANUARY, 12).getDayOfWeek() );
        
//        LocalDateTime localDatetime1=LocalDateTime.of(2016,5,7,12,6,16,54 );
//        System.out.println("Local Date Time Of : "+localDatetime1);
//        
//        System.out.println("Year : "+localDatetime1.getYear());
//        
//       LocalDate dateOfBirth=LocalDate.of(2004,04,26);
//       MonthDay bDay=MonthDay.of(dateOfBirth.getMonth(),dateOfBirth.getDayOfMonth());
//       MonthDay currentMonthDay=MonthDay.from(today);
//       if(currentMonthDay.equals(bDay))
//       {
//           System.out.println("**Happy BirthDay**");
//       }else
//       {
//           System.out.println("Nope , Today is not Your BirthDay .");
//       }
    }
    
}
