/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exception2;

/**
 *
 * @author SanaSheeraz
 */
public class Exception2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int a = 10;

        int b = 0;

        System.out.println("Before Try");

        try{

            int c = a/b;

            System.out.println("C: "+c);

        }catch (NullPointerException e){

            System.out.println("NullPointerException Exception");

            System.out.println(e.getMessage());

        }catch (ArithmeticException e){

            System.out.println("ArithmeticException Exception");

            System.out.println(e.getMessage());

        }catch (Exception e){

            System.out.println("Exception Exception");

            System.out.println(e.getMessage());

        }

        System.out.println("After Try");


    }
    
}
