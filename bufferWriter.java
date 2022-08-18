import java.io.*;
class bufferWriter
  {
    public static void main(String ar[]) throws Exception
    {
      FileWriter w=new FileWriter ("Dheeraj.txt");
      BufferedWriter bw= new BufferedWriter (w);
      char c[]= {'D', 'h', 'e','e','r','a','j'};
      bw.write(c, 0, c.length);
      String s="\n--Hi im dheeraj, how can i reach you...?";
      bw.write(s, 0, s.length());
      bw.close();
      w.close();
    }
  }