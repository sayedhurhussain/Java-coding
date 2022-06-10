public class AddArray {

    public static void main(String[] args) {
       
        int twoDArray[][] = new int[5][6];
	int i = 0;
	while(i<=5)
       
            {
                i++;
                
            }

      	int j = 0;
	while(j<=6)
            {
                j++;
                 twoDArray[i][j] = i*j;
		
               System.out.println("The values is: "+twoDArray[i][j]);     
            }
    }
    
}
