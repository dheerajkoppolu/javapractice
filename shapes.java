/*Create a class named 'Shape' with a method to print "This is This is shape". Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both having a method to print "This is rectangular shape" and "This is circular shape" respectively. Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.*/
class shape
  {
    public void display()
    {
      System.out.println("This is This is Shape");
    }
  }

    class Rectangle extends shape
    {
      public void show()
      {
      System.out.println("This is rectangular shape");
      }
    }
    class Circle extends shape
      {
        public void showw()
        {
          System.out.println(" This is circular shape");
        }
      }
    class square extends Rectangle
      {
        void prints()
        {
          System.out.println("Square is a rectangle");
        }
      }
class shapes
  {
    public static void main(String ar[])
    {
      square obj=new square();
      obj.display();
      obj.show();
    }
  }
  