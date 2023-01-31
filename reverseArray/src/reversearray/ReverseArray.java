/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reversearray;

import java.io.IOException;

/**
 *
 * @author SanaSheeraz
 */
public class ReverseArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        char[] arr=new char[50];
        System.out.println("enter character");
        //Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
              arr[i]=(char)System.in.read();
            if(arr[i]=='.')
                break;    
        }
           for(int i=arr.length-1;i>=0;i--)
               System.out.println(arr[i]);
                       
            
        
    }
    
}
