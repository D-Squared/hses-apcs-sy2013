/**
 * this program takes in three doubles and prints them in numerical order
 * solution to Horstmann P5.3
 * @author Darren Tyrone Davis II
 * @version 11/19/2013
 * */

public class DataSet
{
   /**
      Constructs a data set that processes three numbers.
      @param num1 the first number to sort
      @param num2 the second number to sort
      @param num3 the third number to sort
   */
  double num1, num2, num3, twoMin, threeMin;
   public DataSet(double num1, double num2, double num3)
   {
     this.num1 = num1;
     this.num2 = num2;
     this.num3 = num3;
   }

   /**
      Gets the smallest number in the data set.
      @return smallest the smallest of three numbers
   */
   public double getSmallest()
   {
     
     if ( num1 <= num2)
     {
      twoMin = num1; 
     }
     else if (num1 >= num2)
     {
      twoMin = num2; 
     }
     
     if(twoMin <= num3)
     {
      threeMin = twoMin; 
     }
     else if(twoMin >= num3)
     {
      threeMin = num3; 
     }
    return threeMin; 
   }

   /**
      Gets the largest number in the data set.
      @return largest the largest of three numbers
   */
   public double getLargest()
   {
     if ( num1 <= num2)
     {
      twoMin = num2; 
     }
     else if (num1 >= num2)
     {
      twoMin = num1; 
     }
     
     if(twoMin <= num3)
     {
      threeMin = num3; 
     }
     else if(twoMin >= num3)
     {
      threeMin = twoMin; 
     } 
     return threeMin;
   }

   /**
      Gets the middle number in the data set.
      @return middle the middle number of three numbers
   */
   public double getMiddle()
   {
     double middle = 0.0;
      
     if(twoMin == num1 && twoMin == num2 )
     {
      middle = num3; 
     }
     
     return middle;
   }
   
}