package VersionNumber;

public class Demo {

	public static void main(String[] args) throws BookDuplicateException,BookNotFoundException,VersionMismatchException {
		int bookId=1;
		BookRepository bookRespository=new BookRepository();
		Book book=new Book();
		book.setId(bookId);
		bookRespository.add(book);
		System.out.println("An empty book with version "+ book.getVersion()+ 
				" was added to repository");
		// Alice and Bob took the book concurrently
		final Book aliceBook = bookRespository.get(bookId);
		final Book bobBook = bookRespository.get(bookId);
		aliceBook.setTitle("Practical Design Patterns"); // Alice has updated book title
		bookRespository.update(aliceBook); // and successfully saved book in database
		System.out.println("Alice updates the book with new version "+ 
				aliceBook.getVersion());
		// now Bob has the stale version of the book with empty title and version = 0
		// while actual book in database has filled title and version = 1
		bobBook.setAuthor("Bob Dylon"); // Bob updates the author
		try {
			System.out.println("Bob tries to update the book with his version "+ 
					bobBook.getVersion());
			bookRespository.update(bobBook); // Bob tries to save his book to database
		} catch (VersionMismatchException e) {
			// Bob update fails, and book in repository remained untouchable
			e.printStackTrace();
			// Now Bob should reread actual book from repository, do his changes again and save again
		}
	}
}