/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylist3;

/**
 *
 * @author sanasheeraz
 */
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o){
        Student st = (Student)o;
        boolean nameEquals = st.getName().equals(this.name);
        boolean ageEquals = st.age == this.age;
        return nameEquals && ageEquals;
    }
}


