/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindromestrfunction;

import java.util.Scanner;

/**
 *
 * @author SanaSheeraz
 */
public class PalindromeStrFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str1, str2 = "";
        Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a string to check if it is a palindrome");
      str1 = in.nextLine();
 
      int length = str1.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         str2 = str2 + str1.charAt(i);
 
      if (str1.equals(str2))
         System.out.println("Entered string is a palindrome.");
      else
         System.out.println("Entered string is not a palindrome.");
 
 
    }
    
}
