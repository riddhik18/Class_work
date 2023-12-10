/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

class Customer
{
    private String customerName,productName;
    private int productQuantity, TotalAmount;
    
    public String getCustomerName()
    {
        return this.customerName;
    }
    public String getProductName()
    {
        return this.productName;
    }
    public int getproductQuantity()
    {
        return this.productQuantity;
    }
    public int getTotalAmount()
    {
        return this.TotalAmount;
    }
    
    public void getInfo()
    {
        System.out.println("Name : " +customerName);
        System.out.println("Product : " +productName + "  Quantity : "+productQuantity+ "  Price : "+65);
        System.out.println("Total : " +TotalAmount);

    }
    
    
    
    
    public void setdata(String name, String product, int quantity, int amount)
    {
        this.customerName = name;
        this.productName = product;
        this.productQuantity = quantity;
        this.TotalAmount = quantity*amount;
        
    }
    
   
}
/**
 *
 * @author ashum
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Customer obj = new Customer();
        
        obj.setdata("Ashish", "drinks", 30, 65);
        obj.getInfo();
        
    }
    
}