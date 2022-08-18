class vehicle
{
    public static void main(String ar[])
    {
       vehicle audi = new vehicle ();
      audi.price=1000000;
      audi.numOfWheels=4;

      vehicle duke = new vehicle ();
      duke.price=100000;
      duke.numOfWheels=2;

      vehicle leyland = new vehicle ();
      leyland.price=2000000;
      leyland.numOfWheels=8;


      audi.displayCarInformation();
      duke.displayCarInformation();
        leyland.displayCarInformation();
    }
  
    int price;
    int numOfWheels;

    void displayCarInformation()
    {
      System.out.println("The vehicle price is " +price +" and No of wheels="+numOfWheels);
    }
  
}
  