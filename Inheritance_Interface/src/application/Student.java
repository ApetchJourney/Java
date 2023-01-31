/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package application;

/**
 *
 * @author SanaSheeraz
 */
public class Student extends Human implements Pakistani, Sindhi, Punjabi {
public Student(String name, int age) {
        super(name, age);
    }
    public void study(){
        System.out.println("Study in Student");
    }

    public void jugar(){
        System.out.println("Pakistani Jughar in Student");
    }


    public void sindhiJugar() {
        System.out.println("Sindhi Jughar in Student");
    }

    @Override
    public void panjabiJugar() {
        System.out.println("Panjabi Jughar in Student");    
}
}