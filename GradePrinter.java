import java.util.Scanner;

/**
   This class prints the numeric value of a letter grade given by the user.
*/
public class GradePrinter
{
   public static void main(String[] args)
   {
     do{
      Scanner in = new Scanner(System.in);      
      System.out.println("Enter a letter grade (type x to quit):");
      String input = in.nextLine();
      
      if(input.equalsIgnoreCase("X"))
           {
        
        break;
      }
      Grade g = new Grade(input);
         
      double grade = g.getNumericGrade();
      System.out.println("Numeric value: " + grade);
   }
     while(true);
   }
}
