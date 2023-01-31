/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package july15;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author Sana
 */
public class July15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Demo demo=new Demo();
        Consumer<String> consumer= demo::test1;
        consumer.accept("Java 8 ");
        Predicate<Integer> pre=demo::test2;
        pre.test(5);
        Predicate<Integer> greaterThanTen = (i) -> i > 10;
  
        Predicate<Integer> lowerThanTwenty = (i) -> i < 20; 
        
        boolean result = greaterThanTen.and(lowerThanTwenty).test(25);
        System.out.println(result);
  
        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(25);
        System.out.println(result2);
        
        Function<String,Integer> fun=demo::test3;
        System.out.println("Length of String : "+fun.apply("Welcome"));
        
        
        Function<String,Integer> fun1= String::length;
        String arry[]={"Ali","Anus","Hanzala"};
        for(String str:arry)
        {
            System.out.println(str+" : "+fun1.apply(str));
        }
        Function<Integer, Integer> multiply = (value) -> value * 2;
        Function<Integer, Integer> add      = (value) -> value + 3;

        Function<Integer, Integer> multiplyThenAdd = multiply.compose(add);

        Integer result3 = multiplyThenAdd.apply(3);
        System.out.println(result3);

    }
    
}
