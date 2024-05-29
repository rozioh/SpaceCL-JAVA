package chapter12.exam;

public class LibraryTest {
	public static void main(String[] args) {
		Book book1 = new Book("코스모스", "칼세이건");
		Book book2 = new Book("인간관계론", "데일카네기");
		Book book3 = new Book("나는 읽고 쓰고 버린다", "손웅정");
		
		MyLibrary lib = new MyLibrary();
		lib.addBook(book1);
		lib.addBook(book2);
		lib.addBook(book3);
		
		System.out.println("도서 리스트: " + lib.getBookTitleList());
		
		System.out.println("------제목으로 도서 찾기-----");
		Book searchBook1 = lib.getBookByTitle("코스모스");
		if(searchBook1 != null) {
			System.out.println("제목: " + searchBook1.getTitle() + ", 저자: " + searchBook1.getAuthor());			
		}
		
		System.out.println("------저자로 도서 찾기-------");
		Book searchBook2 = lib.getBookByAuthor("손웅정");
		if(searchBook2 != null) {
			System.out.println("제목: " + searchBook2.getTitle() + ", 저자: " + searchBook2.getAuthor());
		}
		
		System.out.println("도서관 책 보유 개수: " + lib.getBookNum() + " 권");
		
		
	}

}
