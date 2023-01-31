/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NullPointerException;
/**
 *
 * @author SanaSheeraz
 */
class Printer 
{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        printString(name);
    }

    private void printString(String s) {
        System.out.println(s + " (" + s.length() + ")");
    }

}
        
public class NullPointerException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Printer printer = new Printer();
        try{
        printer.print();
        }catch(NullPointerException e)
        {
            System.out.print("NullPointerException Caught");
        }
    }
    
}
