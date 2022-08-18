/* JFM1T4_Assignment1:
   Write a program to find the highest among the given 3 numbers.
   Prompt the user for the 3 numbers to be input from the terminal.

   SampleInput: 
   Enter the first number: 11
   Enter the second number: 22
   Enter the third number: 1

   Expected Output:
   22 is highest number
 	
*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class HighestNumber {
     
//Add main method
public static void main(String ar[])
  {
    
//Declare the three variables
int a,b,c;
//Use the scanner class to provide input at execution time

 Scanner s= new Scanner(System.in);
 System.out.println("Enter the first number");
 a=s.nextInt();
  System.out.println("Enter the Second number");
 b=s.nextInt();
    System.out.println("Enter the Third number");
 c=s.nextInt();

 if (a>b && a>c)
   System.out.println(a+ "is the highest number");
 else if (b>a && b>c)
   System.out.println(b+ "is the highest number");
  else 
   System.out.println(c+ "is the highest number");


//check which number is highest using if else condition

//Print the highest of three numbers
  } 
}



// very goood
