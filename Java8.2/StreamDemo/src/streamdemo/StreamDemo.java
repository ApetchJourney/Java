/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.joining;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author Sana
 */
public class StreamDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(5);
//        streamIterated.forEach(System.out::println);
//        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//        List<String> str=strings.stream().filter(abc -> !abc.isEmpty()).collect(Collectors.toList());
        
//        str.stream().forEach(x->System.out.println(x));

//        str.stream().forEach(System.out::println);
//        Stream.generate(()->"*").forEach(System.out::println);
//        Stream<Integer> even=Stream.iterate(52, n->n+2).limit(15);
//        even.forEach(System.out::println);
        
       // List<Integer> even1=IntStream.range(2, 18).collect(Collectors.toList());
//        IntStream.range(2, 18).forEach(System.out::println);
        
//        Stream.of("the","cat","sat","on","the","mat","on","the","floor").distinct().forEach(System.out::println);
        //Stream.of("the","cat","sat","on","the","mat","on","the","floor").forEach(x->System.out.print(x+" "));
        Stream.of("the","cat","sat","on","the","mat","on","the","floor").map(x->x+" ").forEach(System.out::print);
        List<Integer> lst=Arrays.asList(45,87,99,22).stream().map(x->x*2).collect(Collectors.toList());
        lst.stream().forEach(System.out::println);
        
        Arrays.asList(45,87,99,22).stream().map(x->x*2).forEach(System.out::println);
        System.out.println("Reduce");
        int even =Arrays.asList(2,3,4,5,8,12).stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
        System.out.println(even);
        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "orange"), new Product(13, "lemon"),new Product(23, "bread"), new Product(13, "sugar"));
        List<String> collectorCollection = productList.stream().map(Product::getName).collect(Collectors.toList());
        
        
    }
    
}
class Product
{
    int num;
    String name;

    public Product(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }
    
}
