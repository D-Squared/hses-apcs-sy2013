/**
 * Class to return numeric value from letter grade
 * solution to Hortzman P5.6
 * @author Darren T Davis II
 * @version 11-13-13
 **/

public class Grade
{
 private String grade;
 private double aGrade;
 
 final static double PLUS_SIGN = 0.3;
 final static double MINUS_SIGN = -0.3;
 /**
      Constructs a Grade from a letter grade
      @param grade the letter grade
   */
 
  public Grade (String grade)
  {
   this.grade = grade;
    
  }
  public Grade (double grade)
  {
   aGrade = grade;
  }
  /**
      Gets the letter grade.
      @return the letter grade
   */
  public String getLetterGrade()
  {
    String result= "";
    
    double whole =  aGrade;
    double remainder = aGrade % 1;
    
  if (whole >= 3.15 )
  {
   result = "A"; 
  }
  else if(whole >= 2.15)
  {
    result = "B";
  }
  else if(whole >= 1.15)
  {
    result = "C";
  }
  else if (whole >= 0.5)
  {
   result = "D"; 
  }
  else
    result = "F";
  if ((0.5 <= remainder) && (remainder < 0.85))
  {
    result += "-";
  }
  else if ((0.15 <= remainder) && (remainder < 0.5))
  {
    result += "+";
  }
  if (result.equals("F+") || result.equals("F-"))
    result = "F";
  
  return result;
  }
  /**
      Gets the numeric value of this grade.
      @return the numeric grade
   */
  public double getNumericGrade()
  {
   double numgrade = 0.0; 
    String letter = grade.substring(0,1);
    String sign = grade.substring (1);
    
    
   if ( letter.equalsIgnoreCase("A"))
   {
     numgrade = 4;
  }
 else if ( letter.equalsIgnoreCase("B"))
   {
     numgrade = 3;
  }
  else if ( letter.equalsIgnoreCase("C"))
  {
    numgrade = 2;
  }
  else if ( letter.equalsIgnoreCase("D"))
  {
    numgrade = 1;
  }
  else if ( letter.equalsIgnoreCase("F"))
  {
    numgrade = 0;
  }
  else
  {
    return -1;
  }
  
   if(sign.equals("+"))
  {
    numgrade += PLUS_SIGN;
  }
  else if(sign.equals("-"))
  {
    numgrade += MINUS_SIGN;
  }
  else
  {
    return numgrade;
  }
  
  
  if (numgrade >=4)
  {
    return 4;
  }
  
  else if (numgrade <= 0)
  {
    return 0;
  }
  
 
 return numgrade ;
}

}