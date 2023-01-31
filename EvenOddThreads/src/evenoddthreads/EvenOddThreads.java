/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evenoddthreads;

/**
 *
 * @author Sana
 */
public class EvenOddThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RunnableDemo t1=new RunnableDemo("Thread1");
        RunnableDemo2 t2=new RunnableDemo2("Thread2");
        t1.start();
        t2.start();
    }
    
}
