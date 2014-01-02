/**
 * Class to parse ArrayLists<> for a purse
 * Solution to Horstmann Ch 7 p7.2-7.5
 * @author Darren "DJ. Otie." Davis II
 * @verson 1.0.0
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
 public String reverseString()
 {
  String output = "purse[";
  for(int i = 5; i > names; i--)
  {
    
  }
  return output +"]";
 }
  }