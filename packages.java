import PACK.square;
import java.util.Scanner;
public class packages
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a=");
      int a= sc.nextInt();
      square Sq= new square();
      Sq.display();
    }
  }