/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylistdemo;

import java.util.ArrayList;
import java.util.Collections; 
import java.util.Iterator;
/**
 *
 * @author sanasheeraz
 */
public class arrayList {
    ArrayList marks=new ArrayList();
    public void storeMarks(){
        marks.add(45);
       marks.add(23);
       marks.add(45);
       marks.add(23);
    
       marks.add(45);
       marks.add(23);
       marks.add(45);
       marks.add(23);
    }
    public void displayMarks(){
        System.out.println("Using For Loop : ");
        System.out.println(marks.size());
        for(int i=0;i<marks.size();i++)
            System.out.println(marks.get(i));
        
        Iterator imarks=marks.iterator();
        System.out.println("Using While Loop : ");
        while(imarks.hasNext()){
            System.out.println(imarks.next());
        }
        Collections.sort(marks);
        System.out.println("Sorted List is : "+marks);
        
        
        System.out.println(marks);
    }   
}
