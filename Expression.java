/*  JFM1T2_Assignment7:

     Assume that the integer variable a is 20 and b is 10. Evaluate the following expressions and print the value of resultant variable:
     1. int b= a-- - --a;
     2. int c=a--;
     3. int d=a>>2;
     4. int e=a&b;
     Prompt the user input from the terminal.
     
*/


import java.util.Scanner;

public class Expression {
  public static void main(String ar[])
  {
    int a;   
    int b;
    int c=0;      //initial value of c is 0
    int d=0;      //initial value of d is 0
    int e=0;      //initial value of e is 0
    
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the value of 'a' : ");
    a = sc.nextInt();  //input value of a is 20

    System.out.println("Enter the value of 'b' : ");
    b = sc.nextInt();    //input value of b is 10
    
    //given expressions to calculate
    System.out.println ("a-- - --a is: " +(b= a-- - --a));
    System.out.println ("a-- is: " +(c=a--));
    System.out.println ("a>>2 is: " + (d=a>>2));
    System.out.println ("a&b is:  " + (e=a&b));
    
  }

}

// Kindly take the input from the user and keep appropriate comments in the code.
