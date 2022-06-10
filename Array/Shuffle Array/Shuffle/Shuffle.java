import java.util.*;
class Shuffle
{
  public static void main(String args[])
  {
    
    int marks[] = new int[4];
    for(int i = 1; i <= 4; i++)
    
   System.out.println("Original array: " + i );
   System.out.println(" ");
   
    for(int i = 1; i <= 4; i++)
    {
	Random rand = new Random();
      int h = rand.nextInt(5);
System.out.println("Shuffled array: " + h);
    }
    
   }
}