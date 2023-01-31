/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sanasheeraz
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*try {
            // TODO code application logic here
            int i;
            FileInputStream input=new FileInputStream("Z:\\FileText.txt");
            i=input.read();
            while(true)
            {
                if(i!=-1)
                System.out.print((char)i);
                i=input.read();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }*/
         try {
            // TODO code application logic here
            int i;
            FileOutputStream out=new FileOutputStream("Z:\\FileText.txt");
            String a="Good bye ************";
          out.write(a.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
