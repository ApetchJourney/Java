/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedclasses;

/**
 *
 * @author Sana
 */
public class Human implements Employee{
    int age;
    String name;
    String nationality;
    
    public void Eat()
    {
        System.out.println("Human can Eat");
    }
    public void Grow()
    {
        System.out.println("Human can Grow");
    }

    @Override
    public void Work() {
        System.out.println(" Employee Worked Hard");
    }

    @Override
    public void funny() {
        System.out.println("Freind should be funny");
    }

    @Override
    public void care() {
        System.out.println("Freind should be caring");
    }
}
