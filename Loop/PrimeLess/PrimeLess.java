import java.util.Scanner;
class PrimeLess
{
public static void main (String args[])
{
boolean test;
int n, i, j;
 		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Charter : ");
		
		n = scan.nextInt();
for(j=2; j<=n; j++)
	{
		test=true;
		for(i=2; i<j; i++)
		{
		if(j%i==0)
		{
		test= false;
		break;
		}
	}

		if(test)
		System.out.println(j);
		}
System.exit(0);
}
}