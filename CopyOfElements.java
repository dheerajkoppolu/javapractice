//Program to copy all elements of one array into another array

import java.util.Scanner;
class CopyOfElements
  {
    public static void main (String ar[])
    {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter size of the array: ");
    int len=sc.nextInt();
    int arr []=new int[len];
      int arr1[]= new int[arr.length];
      System.out.println("Enter the elements in array1: ");
      for(int i=0; i<arr.length; i++)
        {
          arr[i]=sc.nextInt();
        }
      for(int i=0; i<arr.length; i++)
      arr1[i]=arr[i];
      System.out.println("elements in array1: ");
      for(int i=0; i<arr.length; i++)
        {
         System.out.print(arr[i]+ " ");
        }
      System.out.println();
      System.out.println("elements in array2: ");
      for(int i=0; i<arr.length; i++)
        {
         System.out.print(arr1[i]+ " ");
        }
      System.out.println();
      
      
      

    }
  }