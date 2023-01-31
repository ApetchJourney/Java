/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clocklibrary;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.util.TimeZone;

/**
 *
 * @author SanaSheeraz
 */
public class ClockLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Clock defaultClock=Clock.systemUTC();
        System.out.println("Clock : "+defaultClock);
        
        Clock defaultClock1=Clock.systemDefaultZone();
        System.out.println("Clock : "+defaultClock1);
        

       //Duration
       LocalTime time=LocalTime.now();
        System.out.println("Current Time : "+time);
       LocalTime time1=LocalTime.of(4, 30, 12);
       Duration d=Duration.between(time, time1);
        System.out.println("Duration : "+d);
        
        //Available Time Zone's ID
       /* String[] availableIDs = TimeZone.getAvailableIDs();

      for(String id : availableIDs) {
         System.out.println("Timezone = " + id);
      }*/
         //Instant
         Instant first = Instant.now();
          System.out.println("First : "+first);
        /*Instant second = Instant.now();
        System.out.println("second : "+second);
        Instant third=Instant.now();
        System.out.println("third : "+third);
        Duration duration = Duration.between(first, third);
          System.out.println("Duration : "+duration);
         */
          
          Duration duration=Duration.ofDays(4);
          System.out.println("Duration :"+duration);
          
          System.out.println("Duartion After Minus Hours : "+duration.minusHours(24));
          
          //Instant
          Instant sampleNow=Instant.now();
          System.out.println("Sample Now : "+sampleNow);
          Instant sampleFuture=sampleNow.plusNanos(4);
          System.out.println("Sample Future : "+sampleFuture);
          Instant samplePast=sampleNow.minusNanos(4);
          System.out.println("Sample Past : "+samplePast);
          
          
    }
    
}
