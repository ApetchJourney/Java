/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package constructor1;

/**
 *
 * @author sanasheeraz
 */
class Student
{
    
    Student()
    {
        System.out.print("Intro to ");  
    }
    void Name()
    {
        System.out.println("JAVA");
    }
}
public class Constructor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student st=new Student();
        st.Name();
    }
    
}
