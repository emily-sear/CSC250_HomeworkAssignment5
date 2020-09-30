import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) //can write "throws Exception" and if the exception happens your program just crashes
	//You are leaving anything bad that happens in main up to the java virtual machine
	{
		//System.getProperty() finds the file
		try 
		{
			Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/input.dat"));
			
			while(input.hasNext())
			{
				System.out.println(input.next());
			}
			
			input.close();
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			//You are just going to print out the bad thing that happened to the screen
			//this is the exact same thing that the java virtual machine does
			e.printStackTrace();
		}
		
		
		BibleBook book1 = new BibleBook("Matthew", 28, "The first Gospel of Jesus Christ.");
		BibleBook book2 = new BibleBook("Genesis", 50, "The first book of the Bible; Creation story.");
		BibleBook book3 = new BibleBook("Revelation", 22, "The last book of the Bible; End times.");
		
		book1.displayBook();
		System.out.println("\n");
		book2.displayBook();
		System.out.println("\n");
		book3.displayBook();
		
		//this function is a getter not a setter
		//you can read but you cannot write
		System.out.println(book1.getBookName());
		
		//always put the class in front of it, just do it bro. it is a bad idea not to 
		System.out.println(Main.addNums(3,5));
		
		//calling an instance method
		book1.addSumsNonStatic(1, 4);
		
		
		
	}
	
	static int addNums(int a, int b)
	{
		return a + b; 
	}
}
