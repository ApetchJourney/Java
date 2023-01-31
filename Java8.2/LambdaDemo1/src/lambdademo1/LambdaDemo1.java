/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdademo1;

/**
 *
 * @author Sana
 */
public class LambdaDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        TestingInterface tInter=new TestingInterface() {
//            @Override
//            public int add(int a, int b) {
//                return a+b;
//            }
//        };
//        int result=tInter.add(4, 5);
        
//        TestingInterface tI= (a,b)-> {System.out.println("Result : "+(a+b));System.out.println("End of Code");};
//        tI.add(6, 7);
        //System.out.println("Result : "+result);
        
//        TestingInterface l1=x->System.out.println("Value : "+x);
//        l1.print("Hello");
            TestingInterface l2=()->System.out.println("No Paarmeters");
            l2.Message();
    }
    
}
