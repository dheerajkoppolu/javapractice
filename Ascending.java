import java.util.Scanner;
class Ascending
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner (System.in);
      System.out.println("Enter size of the array: ");
      int size=sc.nextInt();
      int arr[]=new int [size];
      System.out.println("Enter the elements in the array: ");
      for (int i=0; i<arr.length; i++)
        {
          arr[i]= sc.nextInt();
        }
      int temp=0;
      System.out.println("Original array");
      System.out.println("--------------");
      for (int i=0; i<arr.length; i++)
        {
          System.out.print(arr[i]+"    ");
        }
      
      System.out.println();
      for (int i=0; i<arr.length; i++)
        {
          for (int j =i+1; i<arr.length; j++)
            {
            if (arr[i]> arr[j])
            {
              temp=arr[i];
              arr[i]=arr[j];
              arr[j]= temp;              
            }
            }
        }
       System.out.println();  
      System.out.println("ascending order: ");
      for (int i=0; i<arr.length; i++)
        {
      System.out.print(arr[i]+ "  ");
        }
    }
  }
        