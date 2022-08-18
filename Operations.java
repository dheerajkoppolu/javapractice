
  /*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/


import java.util.Scanner;

public class Operations {
  public static void main (String ar[])
  {

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number");
    int a=sc.nextInt();
    System.out.println("Enter second number");
    int b=sc.nextInt();

    System.out.println("the difference between "+a+" and "+b+" is "+(a-b));

    System.out.println("Enter first number");
    int x=sc.nextInt();
    System.out.println("Enter second number");
    int y=sc.nextInt();

    System.out.println(x*y);
    } 

}


// Kindly take the input from the user and keep appropriate comments in the code.
