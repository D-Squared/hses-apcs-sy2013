public class PurseTester
{
 public static void main(String [] args)
 {
  
   Purse myPurse= new Purse();
   myPurse.addCoin("Quaters");
   myPurse.addCoin("Dime");
   myPurse.addCoin("Nickel");
   myPurse.addCoin("Dime");
   System.out.println(myPurse.toString());
   
 }
}