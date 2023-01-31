/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionaldemo;

/**
 *
 * @author Sana
 */
public class FunctionalDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        FunctionalDemo perform = new FunctionalDemo();
        //to receive results with type declaration
        MathOperation add = (int ab, int xy) -> ab + xy;
        // to receive results without type declaration
        MathOperation subtr = (ab, xy) -> ab - xy;
        // to receive results with return statement along with curly braces
        MathOperation multi = (int ab, int xy) -> { return ab * xy; };
        // to receive results without return statement and curly braces
        MathOperation div = (int ab, int xy) -> ab / xy;
        System.out.println("Addition operation with Type declaration : 20 + 5 = " + perform.operate(20, 10, add));
        System.out.println("Subtraction operation without Type declaration: 20 - 5 = " + perform.operate(20, 10,subtr));
        System.out.println("Multiplication with return statement : 20 x 5 = " + perform.operate(20, 10, multi));
        System.out.println("Division operation without return statement : 20 / 5 = " + perform.operate(20, 10,div));
        
    }
    private int operate(int ab,int xy,MathOperation mp)
    {
        return mp.operation(ab, xy);
    }
    
}
