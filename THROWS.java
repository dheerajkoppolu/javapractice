import java.io.*;
class THROWS
  {
    public static void main(String ar[])
    throws IOException,ArrayIndexOutOfBoundsException
    {
      int p=5;
      if(p!=5)
      {
        throw new IOException();
      }
      else
      {
        throw new ArrayIndexOutOfBoundsException();
      }
        }
      //int x=10,y=3;
      /*try
        {
        throw new NullPointerException();         
        }

      catch (NullPointerException a)
        {       
      System.out.println(a);
        }
      System.out.println("Demo");

        
      /*if(x%y==0)
      {
        throw new ArithmeticException();
          
          
          System.out.println("This is a throws program");*/
        
    }
      
    
  