/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package forlabel;

/**
 *
 * @author SanaSheeraz
 */
public class ForLabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        upper:
        for(int i = 1;i<5;i++){
            inner:
            for(int j = 1;j<3;j++){
                System.out.println(i+" : "+j);
                if(i==j){
                    continue upper;
                }
            }
            System.out.println("After");
        }
    }
    
}
