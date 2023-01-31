/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immutable;

/**
 *
 * @author Sana
 */
public class Immutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String str="Hello";
        String str2="Hello";
        String str1=new String("Hello");
        String str3=new String("Hello");
        System.out.println(str);
        System.out.println(str1);
        
        //String str2=str;
        //String str3=str1;
        System.out.println("String str and String str2 are equal : "+(str==str2)); 
        System.out.println("String str1 and String str3 are equal : "+(str1==str3));
    }
    
}
