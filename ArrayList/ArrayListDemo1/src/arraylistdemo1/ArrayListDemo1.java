/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylistdemo1;

import java.util.ArrayList;

/**
 *
 * @author sanasheeraz
 */
public class ArrayListDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Student> al=new ArrayList();
        
        al.add(new Student("Ali",12,2));
        al.add(new Student("Asad",12,2));
        al.add(new Student("Abdullah",12,2));
        al.add(new Student("Hassan",12,2));
        al.add(new Student("Zakir",12,2));
        
        for(Object v:al)
        {
            System.out.println(v);
        }
        
       al.clear();
        System.out.println(al.size());
    }
    
}
