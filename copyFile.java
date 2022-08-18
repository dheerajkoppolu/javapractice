import java.io.*;
class copyFile
  {
    public static void main(String ar[]) throws Exception
    {
      FileInputStream fin= new FileInputStream ("TTTN-8Eb.jpg");
      FileOutputStream fout= new FileOutputStream("dheeru.jpg");
      int d;
      while((d=fin.read())!=-1)
      
      fout.write(d);
      fin.close();
      fout.close();
    }
  }
  