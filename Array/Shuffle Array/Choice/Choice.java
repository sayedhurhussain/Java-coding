import java.util.*;

class Choice
{
  public static void main(String args[])
  {
    int[] solutionArray = { 1, 2, 3, 4,};

    shuffleArray(solutionArray);
    for (int i = 0; i < 4; i++)
    {
      System.out.print(solutionArray[i] + " ");
    }
    }

  static void shuffleArray(int[] array)
  {
    Random rnd = new Random();
    for (int i = 4-1; i > 0; i--)
    {
      int index = rnd.nextInt(i + 1);
      int a = array[index];
      array[index] = array[i];
      array[i] = a;
    }
  }
}