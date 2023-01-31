/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immutabl1;

/**
 *
 * @author Sana
 */
public class Immutabl1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String strOb1 = "First String";
        String str="world";
        String str1="world";
       // int a=strOb1.length();
        System.out.println("Length of string is : "+strOb1.length());
        System.out.println("Character at 3 : "+strOb1.charAt(3));
        System.out.println("Concatenation in string : "+strOb1.concat(str));
        System.out.println("Difference between the strings : "+str.compareTo(str1));
        System.out.println("Index Of i : "+strOb1.indexOf('i'));
        System.out.println("Last Index Of : "+strOb1.lastIndexOf('i'));
        System.out.println("Replace i with e : "+strOb1.replace('i', 'e'));
        System.out.println("Substring : "+strOb1.substring(6, 12));
        
//        String strOb2 = strOb1;
//        String str=new String("Hello");
//        String str1=str;
//        System.out.println("String strOb1 : "+strOb1);
//        System.out.println("String strOb2 : "+strOb2);
//        System.out.println("String str : "+str);
//        System.out.println("String str1 : "+str1);
//        strOb1="First";
//        str="World";
//        System.out.println("String strOb1 : "+strOb1);
//        System.out.println("String strOb2 : "+strOb2);
//        System.out.println("String str : "+str);
//        System.out.println("String str1 : "+str1);
       
    }
    
}
