/* JFM1T4_Assignment5:
   Write a program to print the following pattern:
       a
     a b a
   a b c b a
     a b a
       a
*/

public class DiamondPattern {

//Add main method here
public static void main (String ar[])
  {

    int n=3;
    for (int i =1; i< n; i++)
      
      {  
        int p='a';
        
        for (int j=i; j<=n; j++)
          {
            System.out.print("  ");
          }
        for (int j=1; j<i; j++)
          {
          System.out.print((char)p++ +" ");
          }
        for (int j=1; j<=i; j++)
          {
          System.out.print((char)p-- +" ");
          }
        System.out.println();
      }
      for (int i =1; i<=n; i++)
      {       
        int p='a';
        for (int j=1; j<=i; j++)
          {
            System.out.print("  ");
          }
        for (int j=i; j<n; j++)
          {
          System.out.print((char)p++ +" ");
          }
        for (int j=i; j<=n; j++)
          {
          System.out.print((char)p-- +" ");
          }
        System.out.println();
      }


        
      }
    
        
      }
    
  
//Declare variables i,j,k,m and initialize ch=97(because we are printing alphabet a)

//use for loop and if condition to print a,b,c 
    


// very goood
