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
public class RunnableDemo2 implements Runnable{
    String threadName;
    Thread t;
    int i;
    public RunnableDemo2(String threadName) {
        System.out.println("Creating : "+threadName);
        this.threadName = threadName;
    }
    public void run()
    {
        try
        {
            for(i=2;i<=10;i+=2)
            {
                System.out.println(threadName+" : "+i);
                Thread.sleep(500);
            }
        }catch(Exception e)
        {
            System.out.println(threadName+" "+"Interuppted");
        }
    }
    public void start()
    {
        System.out.println("Starting " +  threadName );
      if (t == null) {
         t = new Thread( this, threadName);
         t.start ();
      }
    }
}
