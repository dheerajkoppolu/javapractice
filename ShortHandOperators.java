/*  JFM1T2_Assignment4:

    Perform the following operations where a = 10 and b =20 using shorthand assignment operators and print the value of a in console for each expression.
     1. a*= b
     2. a-= b
     3. a/= b
     4. a%= b
    Prompt the user input from the terminal.
*/

import java.util.Scanner;

public class ShortHandOperators {
  public static void main ( String ar[])
  {

    int a;
    int b;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 'a' value: ");
    a=sc.nextInt();
    System.out.println("Enter 'b' value: ");
    b=sc.nextInt();
    System.out.println ("a*=b : " +(a*=b));
    System.out.println ("a-=b : " +(a-=b));
    System.out.println ("a/=b : " +(a/=b));
    System.out.println ("a%=b : " +(a%=b));
    
   
      
  }

}

// Kindly take the input from the user, work on the indentation and keep appropriate comments in the code.
