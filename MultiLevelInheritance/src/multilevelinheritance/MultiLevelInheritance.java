/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multilevelinheritance;

/**
 *
 * @author SanaSheeraz
 */
class Product{
        String name;
        int price;
        float weight;
        int prod_id;
        int sell_product;
    }
    class Company extends Product{
        String company_name;
        int total_product , sell_product;
        String Address;
       void cal(){
           int total=total_product-sell_product;
           System.out.println("Remaining Items : "+total);
           int ans=(sell_product*100)/total_product;
           System.out.println("sell of the month is "+ans+"%");
       } 
    }
class Notebook extends Company{
    void notebook(){
        company_name="A";
        total_product=80;
        Address="sbc Street Karachi";
        name="Notebook";
        price=50;
        weight=80;
        prod_id=404;
        sell_product=50;
        cal();
    }
}
public class MultiLevelInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Notebook obj=new Notebook();
      obj.notebook();
        System.out.println("Company Name : "+obj.company_name); 
        System.out.println("Company Address : "+obj.Address);
        System.out.println("Product Name : "+obj.name);
        System.out.println("Product Price : "+obj.price);
        System.out.println("Product Id : "+obj.prod_id);
        System.out.println("Product Sold : "+obj.sell_product);
        
    }
    
}
