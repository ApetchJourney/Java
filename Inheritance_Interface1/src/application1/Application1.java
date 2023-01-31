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
public class Application1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student st = new Student("Usman",35);
        Android a = new AndroidCourse("Advance");
        st.setCourse(a);
        st.printCourseDetails();
    }
    
}
