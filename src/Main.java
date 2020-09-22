public class Main
{
	public static void main(String[] args)
	{
		BibleBook book1 = new BibleBook("Matthew", 28, "The first Gospel of Jesus Christ.");
		BibleBook book2 = new BibleBook("Genesis", 50, "The first book of the Bible; Creation story.");
		BibleBook book3 = new BibleBook("Revelation", 22, "The last book of the Bible; End times.");
		
		book1.displayBook();
		System.out.println("\n");
		book2.displayBook();
		System.out.println("\n");
		book3.displayBook();
		
	}
}
