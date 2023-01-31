/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication41;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.joining;

/**
 *
 * @author Sana
 */
public class JavaApplication41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Product> lstPro=Arrays.asList(new Product(203,"Snacks"),new Product(413,"Drinks"),new Product(651,"Shoes"));
        
        List<String> lstName=lstPro.stream().map(Product::getName).collect(Collectors.toList());
        String names=lstPro.stream().map(Product::getName).collect(joining(" "));
        System.out.println(names);
        
//        List<String> lstName=Arrays.asList();
//        for(Product pro:lstPro)
//        {
//           lstName.add(pro.name);
//        }
        
    }
    
}
class Product
{
    int code;
    String name;

    public Product(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
    
    
}