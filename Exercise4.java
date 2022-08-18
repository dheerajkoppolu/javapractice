/* Write a program to print the following equilateral traingle pattern:
   *
  ***
 *****
*******


class Exercise4 {

	public static void main(String args[]) {*/


class pattern {
	public static void main(String[] args)
	{
		
		int i,j;

		// loop to iterate for the given number of rows
		for (i = 1; i <= 4; i++)
      {

			// loop to print the number of spaces before the star
			for (j = 4; j >= i; j--)
        {
				System.out.print(" ");
			}

			// loop to print the number of stars in each row
			for (j = 1; j <= i; j++)
        {
				System.out.print("* ");
			}

			// for new line after printing each row
			System.out.println();
		}
	}
}


