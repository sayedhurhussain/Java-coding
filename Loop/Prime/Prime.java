import java.util.Scanner;
class Prime
{
public static void main (String args[])
{
boolean test = true;
int n;
 		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Charter : ");
		
		n = scan.nextInt();
for(int i=2; i<n; i++)
	{
		if(n%i==0)
		{
		test= false;
		break;
		}
	}

	if (test)
	 System.out.println("prime");
	 else 
	System.out.println(" Not prime");
	System.exit(0);
}
}
