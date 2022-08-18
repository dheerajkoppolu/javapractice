import java.util.Scanner;
class rotatingArray
  {
    public static void main(String arr[])
    {
      Scanner sc=new Scanner (System.in);
      System.out.println("Enter size of the array: ");
      int size=sc.nextInt();
      int num[]=new int [size];
      System.out.println("Enter the elements in the array: ");
      for (int i=0; i<num.length; i++)
        {
          num[i]= sc.nextInt();
        }
      for (int i=0; i<num.length; i++)
        {
          System.out.print(num[i]);
        }
      System.out.println();

      
      System.out.println("Enter no of places to be repeated: ");
      int n=sc.nextInt();

      for(int i=0; i<n;i++)
        {
          int first = num[0];
          for (int j=0; j<num.length-1;j++)
            {
              num[j]=num[j+1];
            }
          num[num.length-1]= first;
        }
      System.out.println("after rotation: ");
      for (int i=0; i<num.length; i++)
        {
          System.out.print(num[i]);
        }
     // System.out.println();
        
      
    }
  }