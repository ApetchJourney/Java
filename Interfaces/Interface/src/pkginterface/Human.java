/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkginterface;

/**
 *
 * @author SanaSheeraz
 */
public class Human {
   
    private String name;

    private int age;


    public Human(String name, int age){

        this.name = name;

        this.age =age;

    }


    public String getName() {

        return name;

    }


    public void setName(String name) {

        this.name = name;
    }


    public int getAge() {

        return age;
    }

 
   public void setAge(int age)
 {
        this.age = age;
    }


    public void study(){
 
       System.out.println("Study in Human");

    }
}
