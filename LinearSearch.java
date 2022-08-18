import java.util.*;
class LinearSearch
  {
    public static void main(String ar[])
    {
      int a=-1,i;
      Scanner sc= new Scanner(System.in);
      System.out.print("Enter size of the list: ");
      int l= sc.nextInt();
      int list[]= new int[l];
      System.out.println("Enter the elements in the list:  ");
      for ( i=0; i<l; i++)
        {
          System.out.print("list["+i+"]=");
           list[i]= sc.nextInt();
        }
      System.out.println("=====================");
      System.out.println("=====================");
      System.out.print("Search=" );
      int key=sc.nextInt();

      for ( i=0; i<l; i++)
        {
          if(key==list[i])
          {
             a=i;
            break;
            
          }
        }
        
      if(a==-1)
      {
        System.out.println("Search element= "+key+ " is not available in the list");
        System.out.println("Please enter valid element  :   ");
      }
      else 
      {
         System.out.print("Search element= "+key+ "is available in the list at position:"+i);
      }
      }
      
        
        
    }
  