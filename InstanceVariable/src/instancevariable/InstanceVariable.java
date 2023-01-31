/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package instancevariable;

/**
 *
 * @author SanaSheeraz
 */
class Variable
{
    int i=0;
    Variable()
    {
        i++;
        System.out.println(i);
    }
}
public class InstanceVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Variable var1=new Variable();
        Variable var2=new Variable();
        Variable var3=new Variable();
        Variable var4=new Variable();
        Variable var5=new Variable();
        Variable var6=new Variable();
        
    }
    
}
