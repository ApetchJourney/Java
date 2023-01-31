/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionaldemo1;

/**
 *
 * @author Sana
 */
public interface NewInterface1 {
    public default void show(){
        System.out.println("New Interface 1 Method");
    }
}
