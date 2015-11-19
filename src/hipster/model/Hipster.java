package hipster.model;

public class Hipster
{
	private String name;
	private String []  hipsterPhrases;
	private Book [] hipsterBooks;
	
	public Hipster()
	{
		this.name ="";
	    this.hipsterPhrases = new String[4];
	    this.hipsterBooks = new Book[3];
	    
	    setupBooks();
	    setupArray();
	}
	
	
	public Book[] getHipsterBooks()
	{
		return hipsterBooks;
	}


	public void setHipsterBooks(Book[] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}


	private void setupArray()
	{
		hipsterPhrases[0] = "that is so mainstream";
		hipsterPhrases[1] = "im no normal hpster";
		hipsterPhrases[2] = "i did that before it was cool";
		hipsterPhrases[3] = "one caramel machiato ";
	}

	private  void setupBooks()
	{
		Book firstBook, secondBook, thirdBook;
		
		firstBook = new Book();
		firstBook.setAuthor("");
		firstBook.setTitle("");
		firstBook.setSubject("");
		firstBook.setPageCount(666);
		firstBook.setPrice(6.66);
		
		secondBook = new Book();
		secondBook.setAuthor("");
	    secondBook.setTitle("");
	    secondBook.setSubject("");
	    secondBook.setPageCount(666);
		secondBook.setPrice(6.66);
		
		thirdBook = new Book();
		thirdBook.setAuthor("");
		thirdBook.setTitle("");
		thirdBook.setSubject("");
		thirdBook.setPageCount(666);
		thirdBook.setPrice(6.66);
		
		hipsterBooks[0] = firstBook;
		hipsterBooks[1] = secondBook;
		hipsterBooks[2] = thirdBook;
		
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String[] getHipsterPhrases()
	{
		return hipsterPhrases;
	}

	public void setHipsterPhrases(String[] hipsterPhrases)
	{
		this.hipsterPhrases = hipsterPhrases;
	}
}
