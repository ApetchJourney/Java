/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylistdemo1;

/**
 *
 * @author sanasheeraz
 */
public class Student {
    private String Name;
    private int age;
    private int id;

    public Student(String Name, int age, int id) {
        this.Name = Name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String toString()
    {
        return "Name : "+this.getName()+" Age : "+this.getAge()+" Id :"+this.getId();
    }
}
