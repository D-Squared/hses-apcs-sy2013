/**
 * class that runs multiple loops
 * solutions to Gray loop Exercises
 * @author Darren "DJ. Otie."
 * @version 11/21/2013
 */

public class LoopTests
{
 public static void main(String [] args)
 {
   System.out.println("print out the integers from 1 to 21");
  for (int x = 1; x <= 21; x++)
  {
   System.out.println(x); 
  }
  
  System.out.println("print out the integers from 2 to 24 evens only");
  for (int x = 2; x <= 24; x+= 2)
  {
    System.out.println(x);
  }
  
  System.out.println("print out the integers from 3 to 27 in multiples of 3");
  for (int x = 3; x <= 27; x+=3)
  {
   System.out.println(x); 
  }
  
  System.out.println("print out the integers from 15 down to 0");
  for  (int x = 15; x >= 0; x--)
  {
   System.out.println(x); 
  }
  
  System.out.println("print out the integers from 21 down to 3 in multiples of 3");
  for (int x = 21; x >=3; x-= 3)
  {
   System.out.println(x); 
  }
     System.out.println("print out the integers from 1 to 21");
     
     int x = 1;
  while ( x <= 21)
  {
   System.out.println(x);
   x++;
  }
  
 System.out.println("print out the integers from 2 to 24 evens only");
    x = 2;
  while (x<= 24)
  {
    System.out.println(x);
    x +=2;
  }
  
  System.out.println("print out the integers from 3 to 27 in multiples of 3");
  x = 3;
    while( x<=27)
  {
   System.out.println(x); 
   x+=3;
  }
  
  System.out.println("print out the integers from 15 down to 0");
  x=15;
  while (x>= 0)
  {
   System.out.println(x); 
   x--;
  }
  
  System.out.println("print out the integers from 21 down to 3 in multiples of 3");
  x= 21;
  while ( x>=3 )
  {
   System.out.println(x); 
   x-=3;
  }
 }
 
}