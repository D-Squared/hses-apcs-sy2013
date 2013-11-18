import java.util.Scanner;
public class ProductTester
{
  public static void main (String [] args)
  {
    String locateName = " ";
    double locatePrice = 0.0;
    
    Product one = new Product ("Toaster", 29.95);
    locateName= one.getName();
    System.out.println(locateName);
    
    locatePrice = one.getPrice();
    System.out.println(locatePrice);
    
    one.reducePrice(10.0);
    locatePrice = one.getPrice();
    System.out.println(locatePrice);
    
    System.out.println("Enter Price: ");
    
    
    
  }
}