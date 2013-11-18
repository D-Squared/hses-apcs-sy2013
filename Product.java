/*start class with "public class ___"
 * String name= instance variable
 */

public class Product
 {
  private String name;
  private double price;
  
  public Product( String initName, double initPrice)
  {
    name = initName;
    price = initPrice;
  }
  public String getName()
  {
   return name;
  }
  public double getPrice()
  {
    return price;
  }
  public void reducePrice(double change)
  {
    double newPrice = price- change;
    price= newPrice;
  }
  public void setPrice(double initPrice)
  {
    price= initPrice;
  }
}
   

 