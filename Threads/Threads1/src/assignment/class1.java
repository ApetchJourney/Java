/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment;

/**
 *
 * @author SanaSheeraz
 */
public class class1 {
    private int count = 0;
    private boolean even = true;
    private int Limit;
  
    class1(int limit) {
        Limit = limit;
    }

    public int getLimit() {
        return Limit;
    }

    public void setLimit(int Limit) {
        this.Limit = Limit;
    }
  
    public synchronized int printNextOdd() {
        while (even) {
            try {
                wait();
                Thread.sleep(499);
            } catch (InterruptedException e) {
            }
        }
        count++;
        if (count <= Limit) {
            printEven(count);
        }
        even = true;
        notifyAll();
        return count;
  
    }
  
    public synchronized int printNextEven() {
        while (!even) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        count++;
        if (count <= Limit) {
            printOdd(count);
        }
        even = false;
                
        notifyAll();
        return count;
    }
  
    public void printOdd(int num) {
        System.out.println("ODD:" + num);
    }
  
    public void printEven(int num) {
        System.out.println("EVEN:" + num);
    }
}
