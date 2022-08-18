import java.util.Scanner;
class sumOfElements
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
          System.out.println("Enter the  value of element "+(i+1)+ ":");
          array[i]= sc.nextInt();
        }
      int sum=0;
      for (int i=0; i<array.length; i++)
        {
        sum=sum+array[i];
        }
      System.out.println("The sum of all the elements in the array is: "+ sum);
        }
  }
