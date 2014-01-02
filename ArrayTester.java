/** Solution to Array and ArrayList CW Lab Exercises
  *  @Author Darren "DJ. Otie." Davis II
  * @Version 0.1
  * */

import java.awt.Rectangle;
public class ArrayTester
{
public static void main (String [] args)
{
  //  Ex 1 ++++++++++++++++++++++++++++++++++++++++++++++++++++++++
  int [] array_a = {1,2,3,4,5,6,7,8,9,10};
   for (int i = 0; i< array_a.length; i++){
    System.out.println(array_a[i]);
  }
  System.out.println("Ex 2 ++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
  for (int i : array_a)
  {
    if(i % 2 ==0){
       
   System.out.println(i);
    }
  }
  
 
  System.out.println("Ex 3 ++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
  int [] array_b =  new int[12];
  for( int i= 0; i< array_b.length; i++)
  {
    array_b[i] = (i+1) *2;
  System.out.print( array_b[i]+" ");
}
  
  System.out.println();
  
  for (int i :array_b){
    System.out.print(i+" ");
    
  }
  System.out.println();
  
  System.out.println("Ex 4 ++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
  int i=0;
  while (array_b.length > i)
  {
    
    System.out.println(array_b[i]);
    i++;
  }
  System.out.println();
  
  System.out.println("Ex 5 ++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
 Rectangle [] array_c = new Recangle[5];
 for( int i=0; i <array_c.length; i++)
 {
   
 }
  
  System.out.println("Ex 6 ++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
  
  
  
}
}