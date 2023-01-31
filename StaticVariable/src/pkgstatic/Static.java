/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgstatic;

/**
 *
 * @author SanaSheeraz
 */
class static_out {
        static int x;
       static int y;
        void add(int a, int b){
            x = a + b;
            y = x + b;
        }
    } 
public class Static {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        static_out obj1 = new static_out();
            static_out obj2 = new static_out();   
            //int a = 2;
            //obj1.add(a, a + 1);
            //obj2.add(5, a);
            obj1.add(2,3);
            obj2.add(3,4);
            System.out.println(obj1.x + " " + obj2.y);
            //System.out.println(static_out.x + " " + static_out.y); 
    }
    
}
