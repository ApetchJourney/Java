/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package evenoddusingthreads;

/**
 *
 * @author SanaSheeraz
 */
public class EvenOddUsingthreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final OddEven a = new OddEven();
        a.odd=true;
        Thread t1;
        t1 = new Thread(new Runnable() {
  
        @Override
         public void run() {
        a.printEven();
  
         }
         });
        Thread t2 = new Thread(new Runnable() {
 
        @Override
        public void run() {
        a.printOdd();
 
        }
        });
 
    t1.start();
    t2.start();
 
    try {
    t1.join();
    t2.join();
    } catch (InterruptedException e) {
    }
 
}
}   
/**
 *
 * @author dell
 */
class OddEven {
 
boolean odd;
int count = 1;
int MAX = 20;
 
public void printOdd() {
synchronized (this) {
while (count < MAX) {
System.out.println("Checking odd loop");
 
while (!odd) {
try {
System.out.println("Odd waiting : " + count);
wait();
System.out.println("Notified odd :" + count);
} catch (InterruptedException e) {
}
}
System.out.println("Odd Thread :" + count);
count++;
odd = false;
notify();
}
}
}
 
public void printEven() { 
try {
Thread.sleep(1000);
} catch (InterruptedException e1) {
}
synchronized (this) {
while (count < MAX) {
System.out.println("Checking even loop");
 
while (odd) {
try {
System.out.println("Even waiting: " + count);
wait();
System.out.println("Notified even:" + count);
} catch (InterruptedException e) {
}
}
System.out.println("Even thread :" + count);
count++;
odd = true;
notify();
 
}
}
    }
    
}
