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
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human h = new Human("Usman",34);
        Student s = new Student("Arbaz",35);
        Human st1 = new Student("Wahaj",36);
        st1.study();
        Pakistani p = new Student("Nimroz",37);
        p.jugar();
        Sindhi si = new Student("Adnan",38);
        si.sindhiJugar();


 
    }
    
}
