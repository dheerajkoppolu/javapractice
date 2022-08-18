class superclass
  {
    String name;
    public void display()
    {
      System.out.println("My name is "+ name);
    }
  }
class subclass extends superclass
  {
    
    String cityName;
    public void display()
    {
      System.out.println("My name is "+name);
    }
    public void show()
    {
      System.out.println("My city name is " +cityName);
    }
  }
class inheri
  {
    public static void main(String ar[])
    {
      superclass ob1 =new superclass();
      ob1.name="Dheeraj";
      ob1.display();

      subclass ob2 = new subclass ();
      ob2.cityName= "Ongole";
      ob2.name = "Sai";
      ob2.display();
      ob2.show();
    }
  }