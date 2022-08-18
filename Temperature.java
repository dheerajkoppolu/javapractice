/* JFM1T5_Assignment3:

   Write a program to store the temperature of your city for last 7 days and print the lowest temperature of the week.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of days 
   3
   Enter the temperature of Day :1
   88
   Enter the temperature of Day :2
   34
   Enter the temperature of Day :3
   0 
   
   Expected Output:
   The lowest temperature of the week 3 is 0.0 celsius

*/


import java.util.Scanner;

public class Temperature{

//Define the main method
public static void main(String args[])
  { 
//Declare the variables and initialize
Scanner sc= new Scanner(System.in);
    int d;
System.out.println(" No of days: ");
    d=sc.nextInt();
    double temp[]=new double[d];
  
      for (int i=1; i<d;i++)
    {
      System.out.println(" Enter temperature of day "+i+": ");
      
        {
      temp[i]=sc.nextDouble();
        }
      /*System.out.println(" Enter temperature of day:1");
      temp[1]=sc.nextDouble();
      System.out.println(" Enter temperature of day:2");
      temp[2]=sc.nextDouble();
      System.out.println(" Enter temperature of day:3");
      temp[3]=sc.nextDouble();
      System.out.println(" Enter temperature of day:4");
      temp[4]=sc.nextDouble();
      System.out.println(" Enter temperature of day:5");
      temp[5]=sc.nextDouble();
      System.out.println(" Enter temperature of day:6");
      temp[6]=sc.nextDouble();
      System.out.println(" Enter temperature of day:7");
      temp[7]=sc.nextDouble();*/
      
    }
    double min=temp[1];
    for(int i=1; i<d;i++)
    {
      if (temp[i]<min)
        {
        min=temp[i];
        }
    }
    System.out.println("The lowest temperature of the week is: "+min);
//Take temperature of 7 days as a input from user

//Calculate the lowest temperature

//Print the result
  }
}
//Good Job!