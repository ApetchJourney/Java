/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package application1;

/**
 *
 * @author SanaSheeraz
 */
public class AndroidCourse implements Android {
    private String name;
    public AndroidCourse(String name){
        this.name = name;
    }
    @Override
    public void runEmulator() {
        System.out.println("Android Emulator is running");
    }

    @Override
    public void CourseName() {
        System.out.println("Course name is : "+this.name);
    }
}