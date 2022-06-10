import java.util.*;
 
public class ShuffleList
{
    public static void main(String[] args)
    {
        ArrayList<String>  mylist = new ArrayList<String>();
	mylist.add("Computer");
        mylist.add("program");
        mylist.add("code");
        mylist.add("practice");
 
        System.out.println(" Original List : \n" + mylist);
 
        Collections.shuffle(mylist);
 
        System.out.println("\n Shuffled List : \n" + mylist);
    }
}