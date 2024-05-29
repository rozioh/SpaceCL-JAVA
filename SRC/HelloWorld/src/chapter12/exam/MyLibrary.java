package chapter12.exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyLibrary extends SchoolLibrary {

	// key: title, value: Book 객체
	private Map<String, Book> mLibMap = new HashMap<String, Book>();
	

	@Override
	public void addBook(Book book) {
		mLibMap.put(book.getTitle(), book);
	}

	@Override
	public String getBookTitleList() {
		if(mLibMap.size() == 0) {
			System.out.println("보유한 책이 없습니다. ");
			return null;
		}
		String titleList = "";
		Iterator<String> ir = mLibMap.keySet().iterator();
		while(ir.hasNext()) {
			String title = ir.next();
			titleList += title + ", ";
		}
		return titleList.substring(0, titleList.length() - 2);
	}

	@Override
	public int getBookNum() {
		return mLibMap.size();
	}

	@Override
	public Book getBookByTitle(String bookTitle) {
		Book searchTitle = mLibMap.get(bookTitle);
		
		if(bookTitle.equals("")) {
			System.out.println("책 제목 입력해");
			return null;
		}else if(searchTitle == null) {
			System.out.println("해당 책은 없습니다.");
			return null;
		}
		return searchTitle;
	}

	@Override
	public Book getBookByAuthor(String author) {

		if(author.equals("")) {
			System.out.println("저자 입력해");
			return null;
		}
		
		Iterator<String> ir = mLibMap.keySet().iterator();
		Book rtnBook = null;
		
		while(ir.hasNext()) {
			String title = ir.next(); // key
			Book book = mLibMap.get(title); // value
			if( author.equals(book.getAuthor()) ) {
				rtnBook = book;
				break;
			}
		}
		
		if(rtnBook == null) {
			System.out.println("해당 책은 없습니다.");
			return null;
		}
		
		return rtnBook;
	}
	
}
