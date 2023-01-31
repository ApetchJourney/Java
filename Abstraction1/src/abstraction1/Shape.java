/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abstraction1;

/**
 *
 * @author SanaSheeraz
 */
public abstract class Shape {
    private final float PI = 3.14F;
    
    public float getPI()
    {
    return PI;
    }
     abstract void calculate(float val);
}
