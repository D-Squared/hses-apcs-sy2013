public class TriangleTester
{
  public static void main (String[] args)
  {
    double checker = 0;
    Triangle tri= new Triangle (15, 30);
    
    checker=tri.getBase();
    System.out.println(checker);
    
    checker=tri.getHeight();
    System.out.println(checker);
    
    checker=tri.getArea();
    System.out.println(checker);
  }
}