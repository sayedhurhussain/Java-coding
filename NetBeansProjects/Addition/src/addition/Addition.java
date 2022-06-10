
package addition;
import javax.swing.*;
public class Addition {

    public static void main(String[] args) {
        
        String A , B;
        int num1 , num2;
        int sum;
       
        A = JOptionPane.showInputDialog(null , "Enter 1st Number: ");
        B = JOptionPane.showInputDialog(null , "Enter 2nd Number: ");
        
        num1 = Integer.parseInt(A);
        num2 = Integer.parseInt(B);
        
         sum = num1 + num2;
         
         JOptionPane.showMessageDialog(null , "Your Answer is: " + sum);
 
    }
    
}
