/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication123;

/**
 *
 * @author SanaSheeraz
 */
public class JavaApplication123 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t);
        // change the name of the thread
        t.setName("My Thread");
        System.out.println("After name change: " + t);
        try {
        for(int n = 5; n > 0; n--) {
        System.out.println(n);
        Thread.sleep(1000);
        }
        } catch (InterruptedException e) {
        System.out.println("Main thread interrupted");
        }

    }
    
}
