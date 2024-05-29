package chapter12.exam;

public class Book {
	private String author;
	private String title;
	
	public Book(String title, String author) {
		super();
		this.author = author;
		this.title = title;
	}
	
	// get, set
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
