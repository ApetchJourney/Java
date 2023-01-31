/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment;

import java.util.Scanner;

/**
 *
 * @author sanasheeraz
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         final class1 Obj = new class1(20);
        Runnable evenNoPrinter = new Runnable() {
  
            public void run() {
                int num = 0;
                while (true) {
                    if (num >= Obj.getLimit()) {
                        break;
                    }
                    num = Obj.printNextEven();
                }
            }
        };
  
        Runnable oddNoPrinter = new Runnable() {
  
            public void run() {
                int num = 0;
                while (true) {
                    if (num >= Obj.getLimit()) {
                        break;
                    }
                    num = Obj.printNextOdd();
                }
            }
        };
  
        new Thread(oddNoPrinter).start();
        new Thread(evenNoPrinter).start();
  
 
    }
        
    }
    

