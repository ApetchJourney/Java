/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorinheritance1;

/**
 *
 * @author Sana
 */
class A
{
    int height,width,area;
    public A()
    {
        System.out.println("A Constructor");
    }
    public A(int height,int width,int area)
    {
        this.height=height;
        this.width=width;
        this.area=area;
    }
    void show()
    {
        System.out.println("Height : "+height+" Width : "+width+" Area : "+area);
    }
}
class B extends A
{
    int height,width,area;
    public B()
    {
        super(7,8,9);
        System.out.println("B Constructor");
    }
    public B(int height,int width,int area)
    {
       super(4,5,6);
        this.height=height;
        this.width=width;
        this.area=area;
    }
    void show()
    {
        super.show();
        System.out.println("Height : "+height+" Width : "+width+" Area : "+area); 
    }
}

public class ConstructorInheritance1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        B obj =new B();
        obj.show();
      
    }
    
}
