/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stringfunction;

/**
 *
 * @author SanaSheeraz
 */
public class StringFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str=new String("hello");
        String str1=new String("world");
        String str2=new String("World");
     String str3=new String("This Is Class");
        //Length
        System.out.println(str.length());
        //concatenation
        System.out.println(str.concat("WORLD"));
        System.out.println(str.concat(str1));
        //Character At
        System.out.println(str.charAt(3));
        
        System.out.println(str1.charAt(2));
        //Equals
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        //Compare to
        System.out.println( str.compareTo(str1));
        
        System.out.println(str3.indexOf("Class"));
        System.out.println(str3.replace('s', 't'));
        System.out.println(str3.substring(5, 7));
        
        
    }
    
}
