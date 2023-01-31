/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author Sana
 */

class Math
{
   void add(int a, int b)
   {
       int c=a+b;
       System.out.println("Integer Parameters");
       System.out.println("Answer is : "+c);
   }
   void add(int a, float b)
   {
       float c=a+b;
       System.out.println("Integer + Float Parameter");
       System.out.println("Answer is : "+c);
   }
   void add(float a, int b)
   {
       float c=a+b;
       System.out.println("Float + Integer Parameter");
       System.out.println("Answer is : "+c);
   }
   void add(float a, float b)
   {
       float c=a+b;
       System.out.println("Float Parameters");
       System.out.println("Answer is : "+c);
   }
   void add(int a, int b,int c)
   {
       int d=a+b+c;
       System.out.println("Three Integer Parameter");
       System.out.println("Answer is : "+d);
   }
   void add(int a, int b,float c)
   {
       float d=a+b+c;
       System.out.println("Two Integer One Float");
       System.out.println("Answer is : "+d);
   }
   
}
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Math m =new Math();
//        m.add(1,3);
//        m.add(3.4f,5);
//        m.add(1,2,3);
        Mother mother=new Mother();
        mother.care();
        Father father=new Father();
        father.care();
        Human human=new Human();
        human.care();
    }
    
}
