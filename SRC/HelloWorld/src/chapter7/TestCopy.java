package chapter7;

public class TestCopy {
	public static void main(String[] args) {
		Book book = new Book("태백산맥", "조정래");
		
		// paramBook을 사용해서 깊은 복사를 한다.
		Book paramBook = new Book();
		paramBook.setAuthor(book.getAuthor());
		paramBook.setBookName(book.getBookName());
		
		Student2.changeBook(paramBook);
		
		System.out.println(book.getAuthor());
		System.out.println(book.getBookName());
	}
} // end class
