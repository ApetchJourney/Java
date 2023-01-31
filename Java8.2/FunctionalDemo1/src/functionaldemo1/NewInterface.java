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
@FunctionalInterface
public interface NewInterface {
    public int calLength(String abc);
    public default void show(){
        System.out.println("Initial Method");
    }
    public static void Display(){
        System.out.println("Static Method");
    }
}
