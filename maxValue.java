import java.util.Scanner;
class maxValue
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
      int max=array[0];
      for (int i=0; i<array.length; i++)
        {
        if (array[i]>max)
          max=array[i];
          
        }
      System.out.println("The max value of the given array is :"+ max);
    }
    
 }
      