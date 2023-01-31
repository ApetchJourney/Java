/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylist3;

import java.util.ArrayList;

/**
 *
 * @author sanasheeraz
 */
public class ArrayList3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student st1 = new Student("Usman",10);
        Student st2 = new Student("Usman",11);
        System.out.println(st1.equals(st2));

        ArrayList<Student> al2 = new ArrayList<Student>();
        al2.add(new Student("Usman",34));
        al2.add(new Student("Arbaz",34));
        al2.add(new Student("Parkash",34));


        System.out.println(
                al2.contains(
                        new Student("Usman",32)));

        //Object b = new Object();
        //Object []a = new Object [4];
        ///a[0].equals(b);
        //a[1].equals(b);
        //a[2].equals(b);
    }
}

 
