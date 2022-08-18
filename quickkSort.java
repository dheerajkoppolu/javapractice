class quickSort
  {
     static int partition(int a[],int low,int high)
    int pivot, l,h;
    {
       pivot = a [low];
       l=low;
       h=high;

      while(l<h)
        {
          while (a[l]<=pivot)
            {
              l++;
            } 
          while(a[h]>pivot)
            {
              h--;
            }
          if (l<h)
            {
              int temp=l;
              h=l;
              h=temp;
            }
        }
          int temp=a[l];
              a[l]=a[h];
              a[h]=temp;
              return h;
        }
    static int QuickSort(int a[],int low, int high)
    {
      if(low<high)
      {
        int pi=partition(a, low, high);
        QuickSort(a, low, pi-1);
        QuickSort(a, pi+1, high);
          
        
      }
    }
    }
import java.util.Scanner;
class quickkSort
  {
    public static void main(String ar[])
    {
      Scanner sc= new Scanner(System.in);
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
    }
  }

    
      
      
      
    
    