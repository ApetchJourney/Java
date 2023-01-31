/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamdemo1;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Sana
 */
public class StreamDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            FileReader reader=new FileReader("C:/Users/sana/Desktop/abc.txt");
            BufferedReader sampleBR=new BufferedReader(reader){
                sampleBR.lines().forEach(System.out::println);
            };
        }catch(Exception ex)
        {
            System.out.println("Exception : "+ex.getMessage()  );
        }
    }
    
}
