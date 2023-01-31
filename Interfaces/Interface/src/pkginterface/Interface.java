/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkginterface;

/**
 *
 * @author SanaSheeraz
 */
interface calculate 
{
    int VAR = 0;
    void cal(int item);
}
class display implements calculate 
{
    int x;
    @Override
    public  void cal(int item) 
    {
    if (item<2)
        x = VAR;
    else
        x = item * item;            
    }
}
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        display[] arr=new display[4];
        for(int i=0;i<4;i++)
        arr[i]=new display();
        arr[0].cal(0);    
        arr[1].cal(1);
        arr[2].cal(2);
        arr[3].cal(3);
        System.out.print(arr[0].x+" " + arr[1].x + " " + arr[2].x+" " + arr[3].x);
 
    }
    
}
