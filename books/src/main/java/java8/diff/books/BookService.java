package java8.diff.books;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
	public  List<Book> arrangeBooksNumberWise(List<Book> bookList)
	{
		Comparator<Book> numberCompare=(Book a,Book b)->{
			Integer number1=a.getBookNumber();
			Integer number2=b.getBookNumber();
			return number1.compareTo(number2);
		};	
		Collections.sort(bookList,numberCompare);
		return bookList;
	}
	public  List<Book> arrangeBooksTitleWise(List<Book> bookList) 
	{
		Comparator<Book> titleCompare=(Book a,Book b)->{
			String title1=a.getBookTitle();
			String title2=b.getBookTitle();
			return title1.compareTo(title2);
		};
		Collections.sort(bookList,titleCompare);
		return bookList;
	}
	 public List<Book> arrangeBooksAuthorWise(List<Book> bookList)
	 {
		 Comparator<Book> authorCompare=(Book a,Book b)->{
				String author1=a.getAuthor();
				String author2=b.getAuthor();
				return author1.compareTo(author2);
			};
			Collections.sort(bookList,authorCompare);
			return bookList;
      }
}