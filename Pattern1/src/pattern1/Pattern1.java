/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pattern1;

/**
 *
 * @author SanaSheeraz
 */
public class Pattern1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=0;i<=3;i++){
            for(int j=0;j<(5-i);j++){
                System.out.print(" ");
            }
            for (int k=1; k<=i;k++){
                System.out.print(""+k);
            }
            for(int l=i;l>=1;l--){
                System.out.print(""+l);
            }
            System.out.print(" ");
            System.out.println("");
        }
    }
    
}
