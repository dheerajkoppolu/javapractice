/* JFM1T5_Assignment 4:

   Write a program to create a square matrix and print its transpose.
   Prompt the user input from the terminal.
   
  Sample Input:
  Enter number of rows: 3
  Enter number of columns: 3
  Elements  [1,1] : 2
  Elements  [1,2] : 3
  Elements  [1,3] : 4
  Elements  [2,1] : 1
  Elements  [2,2] : 2
  Elements  [2,3] : 3
  Elements  [3,1] : 4
  Elements  [3,2] : 5
  Elements  [3,3] : 6
   
  Expected Output:
    
  After Transpose Matrix  
  2       1       4
  3       2       5
  4       3       6
   
*/

import java.util.Scanner;

public class TransposeMatrix {

//Define the main method
public static void main(String args[])
  {
//Declare the variables
int r, c;
    Scanner sc=new Scanner(System.in);
    //Take input from user to enter rows and column values
    System.out.println(" Enter row size: ");
    r=sc.nextInt();
    System.out.println(" Enter columns size: ");
    c=sc.nextInt();
    int ar[][]= new int[r][c];
    

for (int i=0; i<r; i++)
  {
    for (int j=0; j<c; j++)
      {
        System.out.print("Elements["+(i+1)+ ","+(j+1)+"] :");
        ar[i][j]=sc.nextInt();
      }
  }
    int transpose[][]=new int[3][3]; //3 rows and 3 columns  
    
    for (int i=0; i<ar.length;i++)
      {
        for (int j=0; j<ar.length;j++)
        {
          transpose[i][j]= ar[j][i];
        }
      }
    for (int i=0; i<ar.length;i++)
      {
        for (int j=0; j<ar.length;j++)
          {
    System.out.print(transpose[i][j] + " ");
          }
        System.out.println();
      }
  
    
//Convert the square matrix into transpose

//Print the transpose matrix

//printing j and i instead of i and j

}
}
//Good Job!