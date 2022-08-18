import java.util.Scanner;
class midvalue
  {
    public static void main(String ar[])
    {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter no of elements: ");
      int l=sc.nextInt();
      int arr[]= new int[l];
      System.out.println("Enter the elements of the array: ");
      for (int i=0; i<l;i++)
        {
          arr[i]=sc.nextInt();          
        }
      for (int i=0; i<l;i++)
        {
      
     if (l/2==i)
      System.out.println("The midvalue in the given array : " + arr[i]);
        }
     
      
      
    }
  }