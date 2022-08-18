import java.util.Scanner;
class grid
  {
    public static void main(String ar[])
    {
      Scanner sc= new Scanner (System.in);
      System.out.println(" Enter no of rows:");
      int r=sc.nextInt();
      System.out.println(" Enter no of columns:");
      int c=sc.nextInt();
      int arr[][]= new int[r][c];
      System.out.println("Enter the elements of the matrix: ");
      for (int i=0; i<r;i++)
        {
          for (int j=0; j<c; j++)
            { 
              
              arr[i][j]=sc.nextInt();
              
            }
          
        System.out.println();
        }
    }
  }