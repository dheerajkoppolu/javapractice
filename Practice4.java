//1.arithematic operators

/*import java.util.Scanner;
class Practice4{

  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    float a,b,c;
    System.out.println(" Enter the the value of a: ");
    a=sc.nextFloat();
    System.out.println(" Enter the the value of b: ");
    b=sc.nextFloat();
    c=a*b;
    System.out.println("The multiplication of " +a+ " and " +b+ " is " +c );
  }
}*/


//2.ASCII VALUE
/*import java.util.Scanner;
class Practice4{

  public static void main(String ar[])
  {
    Scanner sc=new Scanner(System.in);
    char ch;
    System.out.println(" Enter the character: ");
    ch=sc.next().charAt(0);
    System.out.println(" The ASCII value of the given character is :"+(int) ch);
    
  }
}*/


//3.PRINTING QUOTIENT & REMAINDER
/*import java.util.Scanner;
class Practice4{

  public static void main(String ar[])
  {
    Scanner sc=new Scanner (System.in);
    float num1,num2;
    System.out.println("Enter the num1 value: ");
    num1=sc.nextFloat();
    System.out.println("Enter the num2 value: ");
    num2=sc.nextFloat();
    float quotient=num1/num2;
    float remainder=num1%num2;
    System.out.println("The quotient of " +num1+ " and " +num2+ " is: " +quotient);
    System.out.println("The remainder of " +num1+ " and " +num2+ " is: " + remainder);
    
  }
}*/


//4.swapping of 2 numbers without 3rd variable

/*import java.util.Scanner;
class Practice4{

  public static void main(String ar[])
  {
    Scanner sc=new Scanner(System.in);
    int a,b;
    System.out.println(" value of a : ");
    a=sc.nextInt();
    System.out.println(" value of b : ");
    b=sc.nextInt();
    System.out.println(" The values of a and b before swapping are : "+a+ " : "+b);
    a=a-b;
    b=a+b;
    a=b-a;
    System.out.println(" The values of a and b after swapping are : "+a+ " : "+b);
  }
}*/
    
  
//5. print even or odd using if else

/*import java.util.Scanner;
class Practice4{
public static void main(String ar[])
  {
    Scanner sc=new Scanner(System.in);
    int num;
    System.out.println(" value of a : ");
    num=sc.nextInt();
    
    if(num%2==0)
    {
      System.out.println(" The given number i.e., " +num+ " : even number" );
    }
    else
    {
      System.out.println(" The given number i.e., " +num+ " : odd number" );
    }
    }
}*/

//6. even or odd using ternary

/*import java.util.Scanner;
class Practice4{
public static void main(String ar[])
  {
    Scanner sc=new Scanner(System.in);
    int num;
    System.out.println(" value of a : ");
    num=sc.nextInt();
    
    String evenORodd = (num%2==0)? "EVEN" : "ODD";
    {
      System.out.println("The given number " +num+  " is " +evenORodd);
    }
  }
}*/

//7. given alphabet is vowel or consonant using if else

/*import java.util.Scanner;
class Practice4{
public static void main(String ar[])
  {
    Scanner sc=new Scanner(System.in);
    char ch;
    System.out.println(" ENTER THE ALPHABET : ");
    ch=sc.next().charAt(0);
    if (ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
    {
      System.out.println(" The given alphabet " +ch+ " is VOWEL");
    }
    else
    {
      System.out.println(" The given alphabet " +ch+ " is CONSONANT");
    }
      
    }
}*/



//8.given alphabet is vowel or consonant using switch case


/*import java.util.Scanner;
class Practice4{
public static void main(String ar[])
  {
    Scanner sc=new Scanner(System.in);
    char ch;
    System.out.println(" ENTER THE ALPHABET : ");
    ch=sc.next().charAt(0);
    switch(ch)
      {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        System.out.println(" The given alphabet " +ch+ "is vowel");
      
    break;
    default:
     System.out.println(" The given alphabet " +ch+ "is consonant");
       }
  }
          
 }*/

//9.greatest among 3 numbers

/*import java.util.Scanner;
class Practice4
  {
    public static void main(String ar[])
    {
      float a,b,c;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first number 'a' : ");
      a=sc.nextFloat();
      System.out.println("Enter the second number 'b' : ");
      b=sc.nextFloat();
      System.out.println("Enter the third number 'c' : ");
      c=sc.nextFloat();
      if(a>b && a>c)
      {
        System.out.println("a is greater");
      }
      else if (b>a && b>c)
      {
        System.out.println("b is greater");
      }
      else
        System.out.println("c is greater");
    }
  }*/

//10.highest among three using nested loops

/*import java.util.Scanner;
class Practice4
  {
    public static void main(String ar[])
    {
      float a,b,c;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first number 'a' : ");
      a=sc.nextFloat();
      System.out.println("Enter the second number 'b' : ");
      b=sc.nextFloat();
      System.out.println("Enter the third number 'c' : ");
      c=sc.nextFloat();

      if(a>b)
      {
        if(a>c)
          System.out.println("a is bigger");
        else
          System.out.println("c is bigger");
      }
      else
      {
        if (b>c)
          System.out.println("b is greater");
        else
          System.out.println("c is greater");
      }
    }
  }*/

//11. positve number or negative number

/*import java.util.Scanner;
class Practice4
  {
    public static void main(String ar[])
    {
      double num;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      num =sc.nextDouble();
      if(num>0.0)
      {
        System.out.println("The number is positive number");
      }
      else if (num<0.0)
      {
        System.out.println("The number is negative number");
      }
      else
      {
        System.out.println("The number is Zero");
      }
    }
  }*/

//12. to Check Alphabet using if else

/*import java.util.Scanner;
class Practice4
  {
    public static void main(String ar[])
    {
      char d;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the character");
      d=sc.next().charAt(0);
      if((d>='a' && d<='z') || (d>='A' && d<='Z'))
        {
          System.out.println( " The given character is alphabet");
        }
      else
      {
        System.out.println( " The given character is not alphabet");
      }
    }
  }*/

//13.sum of natural numbers using for loop

/*import java.util.Scanner;
class Practice4
  {
    public static void main(String ar[])
    {
      int num, sum=0;
      Scanner sc=new Scanner (System.in);
      System.out.println("num = ");
      num=sc.nextInt();
      for (int i=0; i<=num;i++)
        {
          sum=sum+i;
        }
      System.out.println("The sum of given natural numbers ="+ sum);
      
    }
  }*/

//14. sum of natural number using while loop
   /* import java.util.Scanner;
    class Practice4
  {
    public static void main(String ar[])
    {
      int num, sum=0, i=1;
      Scanner sc=new Scanner (System.in);
      System.out.println("num = ");
      num=sc.nextInt();
      while (i<=num)
        {
          sum=sum+i;
          i++;
        }
      System.out.println("The sum of given natural numbers ="+ sum);
    }       
}*/

//15. factorial number

/*import java.util.Scanner;
    class Practice4
  {
    public static void main(String ar[])
    {
      long num,i=1, factorial=1;
      Scanner sc=new Scanner (System.in);
      System.out.println("num = ");
      num=sc.nextLong();
      for (i=1; i<=num;i++)
        {
        factorial=factorial*i;  
          System.out.println(factorial);
        }
      
    }
  }*/

//16. multiplication table

/*import java.util.Scanner;
class Practice4
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      int num, i=1,table=1;
    System.out.println(" Enter the multiplication table wanted: ");
      num=sc.nextInt();
      for(i=1;i<=10;i++)
        {
          table = num*i;
          System.out.println(+num+ "x" +i+ "=" +table);
        }
      
      
    }
  }*/

//17. 
      
/*import java.util.Scanner;
    class Practice4
  {
    public static void main(String ar[])
    {
      Scanner sc=new Scanner(System.in);
      int num, i=1;
    System.out.println(" Enter the multiplication table wanted: ");
      num=sc.nextInt();
      while(i<=10)
        {                 
          System.out.println(+num+ "x" +i+ "=" +num*i);
          i++;
        }
    }
  }*/

//18. display the alphabets

/*import java.util.Scanner;
class Practice4{
public static void main(String ar[])
  {
    char from, end,i;
    Scanner sc=new Scanner(System.in);
    
    System.out.print(" enter the starting alphabet: ");
    from = sc.next().charAt(0);
    System.out.print(" enter the ending alphabet: ");
    end = sc.next().charAt(0);

    for(i=from; i<=end; i++)
    {
    System.out.print(i+ " ");
    }
  }
  
}*/
        
    /*import java.util.Scanner;
public class Practice4{
public static void main(String args[]){
char ch,ch1,ch2;//char variable declaration
 Scanner scan=new Scanner(System.in); 
    //create a scanner object for input
    
System.out.print("Enter the Starting Alphabets: ");
ch1=scan.next().charAt(0);//store entered first Alphabet in variale ch1
System.out.print("Enter the Ending Alphabets: ");
ch2=scan.next().charAt(0);//store entered last Alphabet in variale ch2
for(ch=ch1; ch<=ch2; ch++){
System.out.print(ch+" ");
//display Alphabets with space
}
}
}  */

//19. checking prime or not

import java.util.Scanner;
public class Practice4
{
public static void main(String args[])
  {
int num, i;
    boolean flag=true;
 Scanner sc=new Scanner(System.in);   
System.out.print("Enter the number: ");
num=sc.nextInt();
    for(i=2;i<=num/2;i++)
      {
        if(num%i==0)
          flag=false;        
      }
  if (flag)
  {
    System.out.println("The given number "+num+ " is prime");
  }
    else
    {
    System.out.println("The given number "+num+ " is not prime");
    }
  }
}

//20.prime numbers in between given range

/*import java.util.Scanner;
class Practice4
  {
    public static void main{String ar[]{
      
    }
  }*/


/*public class Practice4 {

  public static void main(String[] args) {

    // year to be checked
    int year = 2002;
    boolean leap = false;

    // if the year is divided by 4
    if (year % 4 == 0) {

      // if the year is century
      if (year % 100 == 0) {

        // if year is divided by 400
        // then it is a leap year
        if (year % 400 == 0)
          leap = true;
        else
          leap = false;
      }
      
      // if the year is not century
      else
        leap = true;
    }
    
    else
      leap = false;

    if (leap)
      System.out.println(year + " is a leap year.");
    else
      System.out.println(year + " is not a leap year.");
  }
}*/

/*class Practice4 {
  public static void main(String[] args) {

    int num = 1234, reversed = 0;
    
    System.out.println("Original Number: " + num);

    // run loop until num becomes 0
    while(num != 0) {
    
      // get last digit from num
      int digit = num % 10;
      reversed = reversed * 10 + digit;

      // remove the last digit from num
      num /= 10;
      System.out.println("Reversed Number: " + reversed);
    }

    //System.out.println("Reversed Number: " + reversed);
  }
}*/