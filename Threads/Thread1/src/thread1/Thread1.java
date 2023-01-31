/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thread1;

/**
 *
 * @author SanaSheeraz
 */
public class Thread1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RunnableDemo tr=new RunnableDemo("Thread 1");
        tr.start();
        RunnableDemo t1=new RunnableDemo("Thread 2");
        t1.start();
    }
}
