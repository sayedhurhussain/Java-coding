import java.util.Scanner;
public class WellcomeJava
{
public static void main( String args[])
	{
	Scanner inputObj = new Scanner(System.in);

	String Name;
	
	System.out.println(" Who are you : ?? : ");
	Name = inputObj.nextLine ();

	System.out.println("Hello " + Name);

	System.out.println("Wellcome to Java ! ");
	}
}
