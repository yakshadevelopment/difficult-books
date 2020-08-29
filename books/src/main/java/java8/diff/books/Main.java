package java8.diff.books;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		List<Book> bookList=Library.getAllBooks();
		while(true)	
		{
			System.out.println("            Menu          ");
			System.out.println("1.Display Book Number-wise");
			System.out.println("2.Display Book Title-wise");
			System.out.println("3.Display Book Author-wise");
			System.out.println("4.Exit");
			System.out.println("Enter choice(1-4): ");
			String choice=scanner.nextLine();
			switch(choice)
			{
			case "1":bookList=new BookService().arrangeBooksNumberWise(bookList);break;
			case "2":bookList=new BookService().arrangeBooksTitleWise(bookList);break;
			case "3":bookList=new BookService().arrangeBooksAuthorWise(bookList);break;
			case "4":System.exit(0);
			}// end of switch
		String output=String.format("%-20s %-35s %-20s ","Book Number","Book Title","Author");
	    System.out.println(output);
	    for(Book book:bookList)
	    	System.out.println(book);
		}// end of loop
     }
}
