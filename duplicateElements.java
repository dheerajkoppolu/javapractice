import java.util.Scanner;
class duplicateElements
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter size of the array:  ");
      int size=sc.nextInt();
      int array[]= new int[size];
      System.out.println("Enter the elements: ");
      for (int i=0; i<array.length; i++)
        {
          System.out.println("Enter the  element "+(i+1)+ ":");
          array[i]= sc.nextInt();
        }
      System.out.println("The duplicate elements of the array are: ");
      for (int i=0; i<array.length; i++)
        {
          
          for( int j=i+1; j<array.length; j++)
          {
            if (array[i]==array[j])
            {
              System.out.println( array[j]);
            }
                       
          }
        }
    }
  }