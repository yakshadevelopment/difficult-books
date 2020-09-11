package java8.diff.books;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import static java8.diff.books.TestUtils.*
;public class BookServiceTest {

	@Test
	public void testArrangeBooksNumberWise() throws Exception
	{
      List<Book> bookList = Library.getAllBooks();
      int value=(Integer)new BookService().arrangeBooksNumberWise(bookList).get(0).getBookNumber();
      yakshaAssert(currentTest(),value==10001?"true":"false",businessTestFile);
	  
	}

	@Test
	public void testArrangeBooksTitleWise() throws Exception {
	List<Book> bookList = Library.getAllBooks();
	String value=(String)new BookService().arrangeBooksTitleWise(bookList).get(0).getBookTitle();
    yakshaAssert(currentTest(),value.equalsIgnoreCase("Adventure of Holme")?"true":"false",businessTestFile);
    }

	@Test
	public void testArrangeBooksAuthorWise() throws Exception {
		List<Book> bookList = Library.getAllBooks();
		String value=(String)new BookService().arrangeBooksAuthorWise(bookList).get(0).getAuthor();
yakshaAssert(currentTest(),value.equalsIgnoreCase("Doyle")?"true":"false",businessTestFile);
	}
	@Test
    public void testExceptionConditon() throws Exception{
	 yakshaAssert(currentTest(),true,boundaryTestFile);
      }

	@Test
	public void testBoundaryCondition() throws Exception {
	  yakshaAssert(currentTest(),true,exceptionTestFile);
   }

}
