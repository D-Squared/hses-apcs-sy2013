     /**
 * Class to parse ArrayLists<> for a purse
 * Solution to Horstmann Ch 7 p7.2-7.5
 * @author Darren "DJ. Otie." Davis II
 * @verson 1.0.1
 * @date 1/2/2014
 * */
import java.util.ArrayList;

public class Purse
{
 private ArrayList<String> names; 
 
 public Purse()
 {
   names = new ArrayList<String> ();
 }
 
 public void addCoin(String coinName)
 {
   names.add(coinName);
 }
 
 public String toString()
 {
   
   String output= "purse[";
   
   for(String n:names)
     
         {
           output+=n+",";
         }
   
  return  output+"]";
  
 }
 
 public void reverse()
 {
   
  ArrayList<String> temp = new ArrayList<String> ();
  
  for (int i = names.size()-1; i >=0; i--)
    
  {
    temp.add(names.get(i));
  }
  
 names = temp;
 
 }
 
 public void transfer(Purse other)
 {
  
  names.addAll(other.names);
  other.names.clear();
   
 }
 public boolean sameContents(Purse other)
 {
   
  boolean same = true;
  
  /*if(names.size() != other.names.size())
  {
   same=false;
  }
  
  else
  {
    */
  for(int index= 0; index < names.size(); index++)
  {
    
    for (int index2 = 0; index2 < other.names.size(); index2++)
    {
      
      if(names.get(index) != other.names.get(index2))
  {
        
   same=false;
   
  }
      else
        same=true;
      
    }
    
  }
  
    
    
  return same;
 }
 
 
 public static void main(String[] args)
 {
   
   Purse myPurse= new Purse();
   
   myPurse.addCoin("Quaters");
   myPurse.addCoin("Dime");
   myPurse.addCoin("Nickel");
   myPurse.addCoin("Dime");
   
   System.out.println(myPurse);
   
   myPurse.reverse();
   
   System.out.println(myPurse);
   
   Purse a = new Purse();
   a.addCoin("Dime");
   a.addCoin("Nickel");
   a.addCoin("Dime");
   a.addCoin("Nickel");
   
   System.out.println(a);
   
   Purse b = new Purse();
   b.addCoin("Dime");
   b.addCoin("Nickel");
   b.addCoin("Dime");
   b.addCoin("Dime");
   
   
     
  // a.transfer(b);
   
   
   System.out.println(a);
   System.out.println(b);
   
   System.out.println(a.sameContents(b));
   
 
 }
  }