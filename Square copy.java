public class Square
{
  private int side;
  
  public Square (int length)
  {
    
    side = length;
    
  }
   public int area()
    
   {
     
    return side * side; 
    
   }
   
   public double diagonal()
   {
    
    return side * Math.sqrt(2);
   }
  public static void main (String [] args)
  {
   Square square = new Square(6);
  
   System.out.println(square.diagonal());
  }
}