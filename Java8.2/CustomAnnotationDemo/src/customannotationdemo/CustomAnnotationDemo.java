/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customannotationdemo;

import java.lang.reflect.Method;
import org.netbeans.api.annotations.common.NonNull;

/**
 *
 * @author Sana
 */
public class CustomAnnotationDemo {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
//        @MyAnnotation(DeveloperName = "Ali Khan",count=4,functionName = {"Method1","Method2","Method3"})
//        String abc="Hello";
//        

        @NonNull String str;
        Test test=new Test();
        Class cls=test.getClass();
        
        System.out.println("Class name : "+cls.getName());
        
        Method[] methods=cls.getMethods();
        
        for(Method method:methods)
        {
            System.out.println(method.getName());
        }
        try
        {
            Method m1=cls.getDeclaredMethod("method2", int.class);
            m1.invoke(test,5);
            
        }catch(Exception ex)
        {
            System.out.println("Exception : "+ex.getMessage());
        }
        
//        MyAnnotation mA=Test.class.getAnnotation(MyAnnotation.class);
//        System.out.println(mA);
        
         MyAnnotation mA1=Demo.class.getAnnotation(MyAnnotation.class);
        System.out.println(mA1);
    }
    
}
@MyAnnotation(DeveloperName = "Ali Khan",count=4,functionName = {"Method1","Method2","Method3"})
class Test{
    public int abc;
    private int xyz;
    public void method1(){
        System.out.println("Calling Method 1");
    }
    public void method2(int num){
        System.out.println("Calling Method 2 wiht paarmeter : "+num);
    }
    public int method3(){
        return 5; 
    }
    private void method4()
    {
        System.out.println("Private method invoked");
    }
}

class Demo extends Test{

}
