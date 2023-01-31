/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritance5;

/**
 *
 * @author SanaSheeraz
 */
class A{
    int width,height,area;
    A(){
        System.out.println("constructor A");
    }
    A(int a,int b,int c){
        width=a;
        height=b;
        area=c;
        System.out.println("Parameter Constructor A");
        show_A();
    }
    void show_A(){
        System.out.println("width "+width+" height "+height+" area "+area);
    }
}
class B extends A{
    B(){
        System.out.println("class B Constructor");
    }
    B(int a,int b,int c){
        super(4,5,6);
        width=a;
        height=b;
        area=c;
        System.out.println("Parameter Constructor B");
    }
    void show_B(){
        System.out.println("width "+width+" height "+height+" area "+area);
    }
}
public class Inheritance5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         B obj=new B();
       B obj1=new B(1,2,3);
      obj.show_B();
        obj1.show_B();
        
    }
    
}
