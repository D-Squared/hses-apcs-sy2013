public class GradeTester
{
   public static void main(String[] args)
   {
      System.out.println(new Grade("A").getNumericGrade());
      System.out.println("Expected: 4");
      System.out.println(new Grade("A+").getNumericGrade());
      System.out.println("Expected: 4");
      System.out.println(new Grade("A-").getNumericGrade());
      System.out.println("Expected: 3.7");
      System.out.println(new Grade("F").getNumericGrade());
      System.out.println("Expected: 0");
      System.out.println(new Grade("F-").getNumericGrade());
      System.out.println("Expected: -1");
      System.out.println(new Grade("A*").getNumericGrade());
      System.out.println("Expected: -1");
      System.out.println(new Grade("G").getNumericGrade());
      System.out.println("Expected: -1");      
  }
}
