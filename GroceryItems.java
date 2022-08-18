/* JFM1T5_Assignment 2:

   Write a program to store your 10 different expenses done in this month and print the highest price you incurred.
   Prompt the user for the 10 numbers to be input from the terminal.
   Sample Input:
   45.90
   23.56
   123
   23
   90.00
   344
   44
   60.01
   267
   100
   
   Expected Output:

   The highest price you incurred is 344.0

*/

import java.util.Scanner;

public class GroceryItems {

//Define the main method
public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
//Declare and initialize variables

//Take the 10 different expenses price
     double price []=new double[10];
System.out.println("Enter the price: ");
    for (int i=0; i<10;i++)
    {
    price[i]= sc.nextDouble();
    }
//Check the 10 different expenses price using for loop
    Double max= price[0];
    for(int i=0; i<10;i++)
  {
    //Calculate the highest price in all expenses and check if the expenses is more than new item. If true then return max.
    if (price[i]>max)
    {
      max = price[i];
    }
  }
    


//Print the result
System.out.println("The highest price in the grocery items is: "+ max);
}
}
//Good Job!
