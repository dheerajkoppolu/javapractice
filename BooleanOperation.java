/*  JFM1T2_Assignment3:

     Print the results for the following statements considering x = true and y = false
             1. x&&y
             2. x||y
             3. !x
             4. !y
     Prompt the user input from the terminal.
             
     

*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

  class BooleanOperation
   {
  public static void main(String ar[]) 
    {
    boolean x;
    boolean y;
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter boolean value of x :");
    x=sc.nextBoolean(); //input x boolean value as true

    System.out.println("Enter boolean value of y :");
    y=sc.nextBoolean();  //input y boolean value as false
      
    //given statements
    System.out.println("x&&y is " + (x && y)); 
    System.out.println("x||y is "  + (x || y));
    System.out.println("!x is " + (!x));
    System.out.println("!y is " + (!y));
    
    }

  }

// Kindly work on the indentation and keep appropriate comments in the code.
