import java.util.Scanner;
class printOddPosition
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
      System.out.println("The values in the odd places are:");
      for (int i=0;i<array.length;i=i+2)
        {
          System.out.print(array[i]+"    ");
        }
    }
  }