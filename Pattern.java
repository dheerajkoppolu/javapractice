/* JFM1T4_Assignment4:
   Write a program to print the following pattern:
     1 
     01 
     101 
     0101 
     10101 
*/

public class Pattern {
     
//Add main method here
public static void main (String ar[])
  {
    //Declare variable n and initialize value as 5
    int n=5, x,y;
    for (int i=1;i<=n;i++)
      {
        if (i%2==0)
        {
          x=1;
          y=0;
        }
        else
        {
          x=0;
          y=1;
        }
      
      for (int j=1; j<=i;j++)
        {
        if (j%2==0)
        {
          System.out.print(x);
        }
        else
        {
          System.out.print(y);
        }
        }
        System.out.println();
        }
         
      }



      
  }


//Check whether the i and j are equal or not using for loop

//If i and j are equal check (i+j)%2==0 or not if zero then print one else print zero




// very goood
