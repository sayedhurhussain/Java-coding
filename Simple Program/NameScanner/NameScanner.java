import java.util.Scanner;
public class NameScanner
{
public static void main (String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Name");
String Name = sc.next();
System.out.println("Your Name is " + Name);
}
}