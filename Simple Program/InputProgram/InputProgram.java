import java.util.Scanner;
class InputProgram
{
	public static void main(String args[])
	{
	   Scanner sc = new Scanner(System.in);

	   System.out.println("Enter number: ");
	   int number = sc.nextInt();
	   System.out.println("Number Entered = " + number);

           System.out.println("Enter float: ");
    	   float myFloat = sc.nextFloat();
    	   System.out.println("Float entered = " + myFloat);

	   System.out.println("Enter String: ");
	   String myString = sc.next();
	   System.out.println("Text Entered = " + myString);
	}
}