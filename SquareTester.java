public class SquareTester
{
  public static void main (String[] args)
  {
    double squared = 0;
    Square square = new Square (15);
    squared=square.getSide();
    System.out.println(squared);
    squared= square.area();
    System.out.println(squared);
  }
}
    