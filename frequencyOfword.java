import java.util.Scanner;
class frequencyOfword
  {
    public static void main (String ar[])
    {
      Scanner sc = new Scanner(System.in);
      int i,j, count;
      System.out.println("Enter the string :");
      String str= sc.nextLine();
      String st[]= str.split(" ");
      int len[]= new int [st.length];
      for (i=0; i<len.length; i++)
        len[i]=0;
      for(i=0; i<st.length; i++)
        {
          count =1;
          for (j=i+1; j<st.length; j++)
            {
              if (st[i].equals(st[j]))
              {
                count ++;
             len[j]=-1;
                
              }
            }
          if(len[i]!=-1)
            System.out.println(st[i]+ " has frequency of " +count);
        }
      
      
      

        }
  }