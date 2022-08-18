import java.util.Scanner;
class vowels
  {
    public static void main(String ar[] )
    {
     int count=0;
      Scanner sc= new Scanner (System.in);
      System.out.println("Enter the string: ");
    String string= sc.nextLine();
      
      for(int i=0; i<string.length(); i++)
        {
         if(string.charAt(i) == 'a'|| string.charAt(i) == 'e'|| string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u')
         {
         
            System.out.println("Given string contains vowel:  "+string.charAt(i));
           count++;
         }
                 
        }
      System.out.println("no of vowels: " + count);
  }
  }