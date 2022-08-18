import java.io.*;
class FilesRead
  {
    public static void main(String ar[]) throws Exception
    {
      FileReader f=new FileReader("practice.txt");
      int ch;
      while((ch=f.read()) !=-1)
        System.out.print((char)ch);
      
    }
  }