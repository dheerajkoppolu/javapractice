/*string = "Hardships often prepare ordinary people for an extraordinary destiny";  
word = "";  
words = [];  
   
#Add extra space after string to get the last word in the given string  
string = string + " ";  
   
for i in range(0, len(string)):  
    #Split the string into words  
    if(string[i] != ' '):  
        word = word + string[i];  
    else:  
        #Add word to array words  
        words.append(word);  
        #Make word an empty string  
        word = "";  
          
#Initialize small and large with first word in the string  
small = large = words[0];  
   
#Determine smallest and largest word in the string  
for k in range(0, len(words)):  
      
    #If length of small is greater than any word present in the string  
    #Store value of word into small  
    if(len(small) > len(words[k])):  
        small = words[k];  
          
    #If length of large is less than any word present in the string  
    #Store value of word into large  
    if(len(large) < len(words[k])):  
        large = words[k];  
   
print("Smallest word: " + small);  
print("Largest word: " + large);  

*/

//1. increasing triangle 

import java.util.Scanner;
class patterns
  {
    public static void main(String ar[])
    {
       int n;
      Scanner sc=new Scanner(System.in);
      System.out.println(" No of rows: ");
      n=sc.nextInt();     
      for (int i=1; i<=n;i++)
        {
          for (int j=1; j<=i;j++)
            {
              System.out.print("* ");
            }
          System.out.println();
        }
    }
  }

//2. decreasing triangle

/*import java.util.Scanner;
class patterns
  {
    public static void main(String ar[])
    {
      int rows;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter no of rows: ");
      rows=sc.nextInt();
      for( int i=1; i<rows;i++)
        {
          for (int j=1; j<=i;j++)
            {
              System.out.print("* ");
            }
          System.out.println(" ");
        }

      for( int i=1; i<=rows;i++)
        {
          for (int j=i; j<=rows;j++)
            {
              System.out.print("* ");
            }
          System.out.println(" ");
        }
    }
  }*/


//3. pattern3

/*import java.util.Scanner;
class patterns
  {
    public static void main(String ar[])
    {
      int rows;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter no of rows: ");
      rows=sc.nextInt();

      for(int i=1; i<=rows;i++)
        {
          for (int j=i; j<=rows;j++)
            {
              System.out.print("  ");
            }
          for (int j=1; j<=i;j++)
            {
              System.out.print("* ");
            }
          System.out.println();
        }
    }
  }*/

//4. pattern4

/*import java.util.Scanner;
class patterns
  {
    public static void main(String ar[])
    {
      int rows;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter no of rows: ");
      rows=sc.nextInt();

      for(int i=1; i<=rows;i++)
        {
          for (int j=1; j<=i;j++)
            {
              System.out.print("  ");
            }
          for (int j=i; j<=rows;j++)
            {
              System.out.print("* ");
            }
          System.out.println();
        }
    }
  }*/

//5. pattern5

/*import java.util.Scanner;
class patterns
  {
    public static void main(String ar[])
    {
      int rows;
      Scanner sc=new Scanner(System.in);
      System.out.println(" Enter no of rows of the pattern: ");
      rows=sc.nextInt();

      for(int i=1; i<=rows;i++)
        {
          for (int j=i;j<=rows;j++)
            {
              System.out.print("  ");
            }
          for (int j=1;j<i;j++)
            {
              System.out.print("* ");
            }
          for (int j=1; j<=i;j++)
            {
              System.out.print("* ");
            }
          System.out.println();
        }
      
    }
  }*/

//6. 
/*import java.util.Scanner;
class patterns
  {
    public static void main(String ar[])
    {
      int rows;
      Scanner sc=new Scanner(System.in);
      System.out.println(" Enter no of rows of the pattern: ");
      rows=sc.nextInt();

      for(int i=1; i<rows;i++)
        {
          for (int j=i;j<=rows;j++)
            {
              System.out.print("  ");
            }
          for (int j=1;j<i;j++)
            {
              System.out.print("* ");
            }
          for (int j=1; j<=i;j++)
            {
              System.out.print("* ");
            }
          System.out.println();
        }
          
          for(int i=1; i<=rows;i++)
        {
          for (int j=1;j<=i;j++)
            {
              System.out.print("  ");
            }
          for (int j=i;j<rows;j++)
            {
              System.out.print("* ");
            }
          for (int j=i; j<=rows;j++)
            {
              System.out.print("* ");
            }
              System.out.println();

          
        }
      
    }
  }*/

//6. characters pattern

/*import java.util.Scanner;
class patterns
  {
    public static void main (String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter no of rows: ");
      int rows=sc.nextInt();

      for (int i=1, p='A'; i<=rows; i++, p++ )
        {
          for (int j=1; j<=i; j++)
            {
              System.out.print((char) p+" ");
            }
          System.out.println();
        }
    }
    
  }*/

//7.
/*import java.util.Scanner;
class patterns
  {
    public static void main (String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter no of rows: ");
      int rows=sc.nextInt();

      for (int i=1, p='E'; i<=rows; i++, p-- )
        {
          for (int j=1; j<=i; j++)
            {
              System.out.print((char) p+" ");
            }
          System.out.println();
        }
    }
    
  }*/

//8.
/*import java.util.Scanner;
class patterns
  {
    public static void main(String ar[])
    {
      int rows;
      Scanner sc=new Scanner(System.in);
      System.out.println(" Enter no of rows of the pattern: ");
      rows=sc.nextInt();

      for(int i=1, p='A'; i<rows;i++,p++)
        {
          for (int j=i;j<=rows;j++)
            {
              System.out.print("  ");
            }
          for (int j=1;j<i;j++)
            {
              System.out.print((char)p+ " ");
            }
          for (int j=1; j<=i;j++)
            {
              System.out.print((char)p+ " ");
            }
          System.out.println();
        }
          
          for(int i=1,p='E'; i<=rows;i++, p--)
        {
          for (int j=1;j<=i;j++)
            {
              System.out.print("  ");
            }
          for (int j=i;j<rows;j++)
            {
              System.out.print((char)p+ " ");
            }
          for (int j=i; j<=rows;j++)
            {
              System.out.print((char)p+ " ");
            }
              System.out.println();

          
        }
      
    }
  }*/

//9.
/*import java.util.Scanner;
class patterns
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter no of rows: ");
      int rows=sc.nextInt();
      System.out.println();

      for(int i=1, p='a';  i<=rows;i++,p+=2)
        {
          for (int j=1; j<=i;j++)
            {
              System.out.print((char)p +" ");
            }
        System.out.println();
        }
    }  
  }
*/

//10.
/*
import java.util.Scanner;
class patterns
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter no of rows: ");
      int rows=sc.nextInt();
      System.out.println();

      for(int i=1;  i<=rows;i++)
        {
          for (int j=1; j<=i;j++)
            {
              if (i%2==0)
              {
                System.out.print("B ");
              }
              else
              {
              System.out.print("A ");
              }
             
            }
         System.out.println();
        }
    }  
  }*/

//11.
/*import java.util.Scanner;
class patterns
  {
    public static void main(String ar [])
    {
    Scanner sc=new Scanner(System.in);
      System.out.println("Enter no of rows:");
      int rows=sc.nextInt();
      for (int i=1; i<=rows;i++)
      {
        int p='A';
        for (int j=1; j<=i;j++)
          {
            System.out.print((char)p++ + " ");
          }
        System.out.println();
      
      }
    }
  }*/

//12.
/*import java.util.Scanner;
class patterns
  {
    public static void main(String ar[])
    {
      Scanner sc= new Scanner(System.in);
      System.out.println(" Enter no of rows: ");
      int rows=sc.nextInt();
      for (int i=1; i<=rows;i++)
        {
          int p='A';
          for (int j=i; j<=rows; j++)
          {
            System.out.print("  ");
          }
          for (int j=1; j<i;j++)
          {
            System.out.print((char)p++ + " ");
          }
          for (int j=1; j<=i;j++)
          {
            System.out.print((char)p-- + " ");
          }
          System.out.println();
        }     
    }
  }*/

//13.
/*import java.util.Scanner;
class patterns
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter no of rows:");
      int rows=sc.nextInt();
      for (int i=1,k='E';i<=rows; i++,k--)
      {
        int p='E';
        for (int j=1;j<=i;j++)
          {
        System.out.print(" ");
          }
        for (int j=i;j<=rows; j++)
          {
            System.out.print((char)p-- +"");
          }
        System.out.println();
      }
        
    }
  }*/

/*import java.util.Scanner;
class patterns
  {
    
    public static void main(String ar[])
    {
      String s="CODER";
      int n=s.length();
      for (int i=1,p=0; i<=n; i++,p++)
        {
          for (int j=1; j<=i;j++)
            {
              System.out.print(s.charAt(p) +" ");
            }
          System.out.println();
        }
    }
  }*/
