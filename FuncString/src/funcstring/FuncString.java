/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package funcstring;

/**
 *
 * @author SanaSheeraz
 */
public class FuncString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a = "hello i love java";
            System.out.println(a.indexOf('e')+" "+a.indexOf('a')+" "+a.lastIndexOf('l')+" "+a.lastIndexOf('v'));
      StringBuffer sb=new StringBuffer("Hello");  
          sb.replace(1,3,"Java");  
          System.out.println(sb);
          StringBuffer s1 = new StringBuffer("Hello");
           s1.insert(1,"Java");
           System.out.println(s1);
    }
    
}
