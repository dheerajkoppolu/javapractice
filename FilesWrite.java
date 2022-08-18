import java.io.*;
class FilesWrite
  {
    public static void main(String ar[]) throws Exception
    {
      FileWriter fw= new FileWriter ("dheeraj.txt");
      fw.write((int)'W');

      BufferedWriter bw = new BufferedWriter(fw);
      char c[]={'H' , 'e', 'l', 'l', 'o'};
      bw.write(c, 0, 5);
      String s="---hi, im dheeraj from bitlabs";
      bw.write(s, 0 , s.length());
      bw.close();
      fw.close();
      
    }
  }