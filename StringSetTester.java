public class StringSetTester
{
   public static void main(String[] args)
   {
      StringSet ds = new StringSet("Tom", "Dean", "Harry");
      System.out.println(ds.getSmallest());
      System.out.println("Expected: Dean");
      System.out.println(ds.getMiddle());
      System.out.println("Expected: Harry");
      System.out.println(ds.getLargest());
      System.out.println("Expected: Tom");
      
      ds = new StringSet("Tom", "Harry", "Dean");
      System.out.println(ds.getSmallest());
      System.out.println("Expected: Dean");
      System.out.println(ds.getMiddle());
      System.out.println("Expected: Harry");
      System.out.println(ds.getLargest());
      System.out.println("Expected: Tom");

      ds = new StringSet("Harry", "Dean", "Tom");
      System.out.println(ds.getSmallest());
      System.out.println("Expected: Dean");
      System.out.println(ds.getMiddle());
      System.out.println("Expected: Harry");
      System.out.println(ds.getLargest());
      System.out.println("Expected: Tom");

      ds = new StringSet("Harry", "Tom", "Dean");
      System.out.println(ds.getSmallest());
      System.out.println("Expected: Dean");
      System.out.println(ds.getMiddle());
      System.out.println("Expected: Harry");
      System.out.println(ds.getLargest());
      System.out.println("Expected: Tom");

      ds = new StringSet("Dean", "Tom", "Harry");
      System.out.println(ds.getSmallest());
      System.out.println("Expected: Dean");
      System.out.println(ds.getMiddle());
      System.out.println("Expected: Harry");
      System.out.println(ds.getLargest());
      System.out.println("Expected: Tom");

      ds = new StringSet("Dean", "Harry", "Tom");   
      System.out.println(ds.getSmallest());
      System.out.println("Expected: Dean");
      System.out.println(ds.getMiddle());
      System.out.println("Expected: Harry");
      System.out.println(ds.getLargest());
      System.out.println("Expected: Tom");

      ds = new StringSet("Tom", "Dean", "Harry");
      System.out.println(ds.getSmallest());
      System.out.println("Expected: Dean");
      System.out.println(ds.getMiddle());
      System.out.println("Expected: Harry");
      System.out.println(ds.getLargest());
      System.out.println("Expected: Tom");      
   }
}