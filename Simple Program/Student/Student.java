import javax.swing.JOptionPane;
class Student
{
	int Marks;
	float GPA;
	String Name;
void GPA()
{
System.out.println("Your GPA is :"+ Name);
Name = JOptionPane.showInputDialog("Name");
System.out.println(Marks*3);
}
}

class StudentDemo
{
public static void main(String args[])
{
	Student S1 = new Student ();
	Student S2 = new Student ();
	S1.Marks = 10;
	S2.Marks = 20;
	S1.GPA();
	S2.GPA();
        
	
		
	
}
}