import java.util.Scanner;

class DecimalRounder
{
	public static void main(String args[])
	{
	long answer;
	double input;

	Scanner sc = new Scanner (System.in);

	System.out.println("Enter a Decimal Number.Rounded the nearest integers");
	
	input = sc.nextDouble();
	System.out.println("you Entered"  +  input);

	answer = Math.round(input);
	System.out.println("The Answer is " + answer);
	}
}

	