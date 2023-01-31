/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builtinmethod;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 * @author Sana
 */
public class BuiltInMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Testing t1=new Testing();
        //return anyType , receives nothing
        Supplier<Integer> s1 = t1::Hello;
        System.out.println("Supplier : "+s1.get());
        
        //returns nothig , receive any type
        Consumer<String> c1= t1::CalDisplay;
        c1.accept("Hello World");
        
        Predicate<Integer> p1=t1::greater;
        System.out.println("Greater : "+p1.test(-5));
        
        Function<String,Integer> f1= t1::Calculate;
        System.out.println(f1.apply("Hello World"));
        
        BiFunction<String,Integer,Integer> b1=t1::add;
        System.out.println("Add : "+b1.apply("Ali Khan", 7));
        
        Function<Integer, Integer> multiply = (value) -> value * 2;
        Function<Integer, Integer> add      = (value) -> value + 3;

//        Function<Integer, Integer> addThenMultiply = multiply.compose(add);
        Function<Integer, Integer> multiplyAndThenAdd = multiply.andThen(add);
        Integer result1 = multiplyAndThenAdd.apply(2); //2
        System.out.println(result1);

    }
    
}
