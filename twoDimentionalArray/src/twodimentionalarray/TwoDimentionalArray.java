/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twodimentionalarray;

/**
 *
 * @author SanaSheeraz
 */
public class TwoDimentionalArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int twoD[][]= new int[4][5];
        int i, j, k = 0;
        for(i=0; i<4; i++)
        {
            for(j=0; j<5; j++) 
             {
                twoD[i][j] = k;
                k++;
             }
        }
        for(i=0; i<4; i++) 
        {
          for(j=0; j<5; j++)
          {
              System.out.print(twoD[i][j] + " ");
          }
        System.out.println();
        }
    }
    
}
