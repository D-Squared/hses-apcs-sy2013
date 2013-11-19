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
    String resultWhole = "";
    String resultRemainder = "";
    double remainder;
     
    if(aGrade > 4){
      resultWhole="A+";
    }
    
    
    if(aGrade >= 3.5){
      resultWhole = "A";
      remainder = aGrade % 3;
      
      if(( remainder >= 0.5) && (remainder < 0.85)){
        resultRemainder = "-";
      }
      
 
      
      if((remainder >= 0.15 ) && (remainder < 0.5)){
        resultRemainder = "+";
      }
    }
  

    else if(aGrade > 3.0){
      resultWhole = "B+";
    }
    else if(aGrade > 2.7){
      resultWhole = "B";
    }
    else if(aGrade > 2.3){
      resultWhole = "B-";
    }
    else if(aGrade > 2.0){
      resultWhole = "C+";
    }
    else if(aGrade > 1.7){
      resultWhole = "C";
    }
    else if(aGrade > 1.3){
      resultWhole = "C-";
    }
    else if(aGrade > 1.0){
      resultWhole = "D+";
    }
    else if(aGrade > 0){
      resultWhole = "D";
    }
    else if(aGrade >= 0.5){
      resultWhole = "D-";
    }
    else 
    {
      resultWhole = "F";
    }
  
    return resultWhole;
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