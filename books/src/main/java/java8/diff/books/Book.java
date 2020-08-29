package java8.diff.books;

public class Book {
	private Integer bookNumber;
	private	String bookTitle;
	private String author;
	public Book() {
		super();
	}
	public Book(Integer bookNumber, String bookTitle, String author) {
		super();
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
		this.author = author;
	}
	public Integer getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(Integer bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	@Override
	public String toString() {
	String output=String.format("%-10s %-35s %-20s",bookNumber,bookTitle,author);
	return output;
	}
}
