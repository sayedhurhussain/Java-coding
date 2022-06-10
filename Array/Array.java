public class ArrayAdd
{
    public static void main(String args[])
    {
        int twoDArray[][] = new int[4][5];

        for(int i = 0; i < 4; i++)
            for(int j = 0; j < 5; j++)
            {
                twoDArray[i][j] = i+j;
            }

        for (int i = 0; i < 4; i++)
            for(int j = 0; j < 5; j++)
            {
                System.out.println("The values is: "+twoDArray[i][j]);
            }
    }
}