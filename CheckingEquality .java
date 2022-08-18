/*  JFM1T2_AssignmentPrograms2:

    Write a program to perform the below actions and print the result. Check if the below numbers are equal or not.
    1. 30 and 20
    2. 20 and 20
    3. 20 and 30
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    30
    Enter second number: 
    20
    
    Expected Output:
    30 and 20 is not equal
*/


import java.util.Scanner;

 class CheckingEquality {
  public static void main (String ar[])
  {
    int a;
    int b;
   
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number: ");
    a=sc.nextInt();
    System.out.println("Enter second number: ");
    b=sc.nextInt();
    System.out.println(a==b);
    System.out.println(a==a);
    System.out.println(b==a);
    
    
    
  }


}

// Kindly check the instruction given in the code and redo it, work on the indentation and keep appropriate comments in the code.
