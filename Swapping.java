 /*  JFM1T2_Assignment6:

    Write a program that swaps the values of 2 variables without using third variable.
    Prompt the user input from the terminal.
  */
    
    
import java.util.Scanner;

public class Swapping {
  public static void main (String ar[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number: ");
    int a=sc.nextInt();
    System.out.println("Enter Second number: ");
    int b=sc.nextInt();
    System.out.println("Values Before swapping :"+a+" "+b+" " );
        a = a + b;   
        b = a - b;         //swapping
        a = a - b;
    System.out.println("Values After swapping :"+a+" "+b+" " );
    
    
  }
}

// Kindly work on the indentation and keep appropriate comments in the code.
