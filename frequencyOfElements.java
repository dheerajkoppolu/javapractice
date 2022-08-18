import java.util.Scanner;
class frequencyOfElements
  {
    public static void main(String a[])
    {
      Scanner sc=new Scanner (System.in);
      System.out.println("Enter size of the array: ");
      int size=sc.nextInt(), i, j;
      int arr[]= new int [size];
      int len[]= new int[arr.length];
      System.out.println("Enter the elements: ");
      for (i=0; i<size; i++)
        {
          arr[i]=sc.nextInt();
        }
      int visited=-1;
      for (i=0; i<arr.length;i++)
        {
          int count =1;
          for (j=i+1;j<arr.length;j++)
            {
              if (arr[i]==arr[j])
              {
                count++;
              len[j]=visited;
              }
            }
        if (len[i]!=visited)
        len[i]=count;
        }
      
      System.out.println("ELEMENT     |     FREQUENCY ");
      System.out.println("-----------------------------");
      for (i=0; i<len.length; i++) //loop to print the frequencies
        {
      if (len[i]!=visited)
        System.out.println(arr[i] +"  |    "+len[i]);
        }
      
    }
  }
