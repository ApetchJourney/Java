/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfacesdemo;

/**
 *
 * @author Sana
 */
public class InterfacesDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
//interfaces can only contain abstract methods
//interfaces can not have data feilds or data members
interface abc 
{
    public void add();
    public int sub();
    
}
interface io
{
    
}
class Demo
{
    
}
class XYZ extends Demo implements abc , io
{

    @Override
    public void add() {
        
    }

    @Override
    public int sub() {
        return 0;
    }
    
}