package VersionNumber;

import java.util.HashMap;
import java.util.Map;

public class BookRepository {
	private final Map<Long,Book> collection=new HashMap<>();
	
	public void add(Book book) throws BookDuplicateException{
		if(collection.containsKey(book.getId())) {
			throw new BookDuplicateException("Duplicated book with id: "+book.getId());
		}
		collection.put(book.getId(), new Book(book));
	}
	
	public void update(Book book) throws BookNotFoundException, VersionMismatchException{
		if(!collection.containsKey(book.getId())) {
			throw new BookNotFoundException("Not found with id: "+book.getId());
		}
		Book latestBook=collection.get(book.getId());
		if(book.getVersion() !=latestBook.getVersion()) {
			throw new VersionMismatchException(
					"Tried to update stale version "+book.getVersion()
					+" while actual version is "+latestBook.getVersion()
					);
		}
		book.setVersion(book.getVersion()+1);
		collection.put(book.getId(), new Book(book));
	}
	public Book get(long bookId) throws BookNotFoundException{
		if(!collection.containsKey(bookId)) {
			throw new BookNotFoundException("Not found book with id: "+bookId);
		}
		return new Book(collection.get(bookId));
	}
}