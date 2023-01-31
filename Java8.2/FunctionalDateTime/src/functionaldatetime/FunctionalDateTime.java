/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionaldatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Function;
import static java.util.stream.Collectors.joining;
import java.util.stream.Stream;

/**
 *
 * @author Sana
 */
public class FunctionalDateTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Function<LocalDate,LocalDateTime> plusTwoM = Function.<LocalDate> identity().andThen(displayDateTime(d -> d.plusMonths(2)));
        System.out.println(Stream.iterate( LocalDate.now(), d -> d.plusDays(1)).limit(10).map(plusTwoM).map(Object::toString).collect(joining(", ")));
        }
        
        public static Function<LocalDate,LocalDateTime> displayDateTime(final Function<LocalDate,LocalDate> test) {
            return test.andThen(d -> d.atTime(2, 2));
        }
    
}
