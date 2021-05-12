public class Car
{
  private String make;
  private String RegPlate;

  public String getMake()
  {
    return make;
  }

  public void setMake(String make)
  {
    this.make = make;
  }

  public String getRegPlate()
  {
    return RegPlate;
  }

  public void setRegPlate(String regPlate)
  {
    RegPlate = regPlate;
  }

  public Car(String make, String regPlate)
  {
    this.make = make;
    this.RegPlate = regPlate;
  }


}
