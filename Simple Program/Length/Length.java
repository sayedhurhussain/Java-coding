import java.util.Scanner;
class Length
{
	public static void main(String orgs[])
	{
	float length, feet, inches;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the inches: ");
	inches=in.nextFloat();
	System.out.println("Enter the feet: ");
	feet=in.nextFloat();
	length=inches + "+" + (feet*2.54);
	System.out.println("The total length is : "+length);
	}
}