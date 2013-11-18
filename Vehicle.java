public class Vehicle
{
  private String type;
  private int wheels;
  public Vehicle(String initVehicle, int initWheels)  
  {
    initVehicle = type;
    initWheels = wheels;
  }
    public void addAWheel(int moarWheels)
    {
      double newWheels = wheels + moarWheels;
      newWheels= wheels;
    }
    public String getVehicle()
    {
    return type;  
    }
    public int getWheels()
    {
      return wheels;
    }
   
}