package java8.diff.books;
import java.util.ArrayList;
import java.util.List;

public class Library {
	private static List<Book> bookList=new ArrayList<>();
	static
	{
		bookList.add(new Book(10006,"War And Peace","Tolstoy"));
		bookList.add(new Book(10002,"Song Offerings","Tagore"));
		bookList.add(new Book(10004,"Macbeth","Shakespeare"));
		bookList.add(new Book(10003,"Tempest","Shakespeare"));
		bookList.add(new Book(10005,"Gora","Tagore"));
		bookList.add(new Book(10001,"Anna Karenina","Tolstoy"));
		bookList.add(new Book(10007,"Hamlet","Shakespeare"));
		bookList.add(new Book(10010,"Hound of Baskerville","Doyle"));
		bookList.add(new Book(10009,"Red Oleanders","Tagore"));
		bookList.add(new Book(10008,"Adventure of Holme","Doyle"));
	}
    public static List<Book> getAllBooks()
    {
    	return bookList;
    }
}
