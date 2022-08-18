import java.util.Scanner;
class reverseOrder
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
          System.out.println("Original array");
          for (int i=0; i<array.length; i++)
            {
            System.out.print(array[i]+ " ");
            }
      System.out.println();
          System.out.println("Reverse array");
          for (int i=array.length-1; i>=0; i--)
            {
            System.out.print(array[i]+ " ");
            }
        
    }
  }

          