public class Triangle
{
 private double base;
 private double height;
 
 public Triangle(double bases, double heights)
 {
  base=bases;
  height=heights;
 }
 public double getBase()
 {
  return base; 
 }
 public double getHeight()
 {
   return height;
 }
 public double getArea()
 {
 return (base*height)* 0.5;
 
}
}