import java.io.*;
class bufferReader
  {
    public static void main(String ar[]) throws Exception
    {
      FileReader f= new FileReader ("practice.txt");
      BufferedReader b= new BufferedReader (f);
      String s;
      while((s=b.readLine()) != null)
        System.out.println(s);
      
    }
  } 