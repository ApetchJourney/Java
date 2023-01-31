/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionaldemo1;

/**
 *
 * @author Sana
 */
public class NewClass implements NewInterface,NewInterface1{

    @Override
    public int calLength(String abc) {
        return abc.length();
    }
    @Override
    public void show()
    {
        NewInterface1.super.show();
    }
}
