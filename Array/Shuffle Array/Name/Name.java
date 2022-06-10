import java.util.Random;
class Name
{
	public static void main (String args[])
	{
		String names[] = {"Aslam" , "Akram" , "Adnan" , "Arif" , "Arsalan"};

		System.out.println( names [new Random().nextInt (names.length)]);
	}
}