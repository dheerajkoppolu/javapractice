//sum of elements in the array
import java.util.Scanner;
class sumOfelementsOfarray
{
public static void main (String ar[])
  {
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter size of array: ");
    int size= sc.nextInt();
    int arr[]= new int [size];
    System.out.println(" enter the elements : ");
    for(int i=0; i<size; i++)
      {
        arr[i]= sc.nextInt();      
      }
    int sum=0;
    for(int i=0; i<size;i++)
      {
        sum=sum+arr[i];
      }
    System.out.println("The sum of elements in the array :  "+ sum);
  }
}