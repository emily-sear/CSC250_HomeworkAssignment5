public class BibleBook 
{
	private String bookName;
	private int numOfChapters;
	private String summaryOfBook;
	
	public BibleBook(String bookName, int numofChapters, String summaryOfBook)
	{
		this.bookName = bookName;
		this.numOfChapters = numofChapters;
		this.summaryOfBook = summaryOfBook;
	}
	
	public void displayBook()
	{
		String display = this.bookName + ": " + this.numOfChapters + " chapters" + "\n" + this.summaryOfBook;
		System.out.println(display);
		
	}
}
