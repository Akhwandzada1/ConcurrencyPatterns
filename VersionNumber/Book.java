package VersionNumber;

public class Book {
	private long id;
	private String title="";
	private String author="";
	private long version=0;
	public Book() {
		
	}
	public Book (Book book) {
		this.id=book.id;
		this.title=book.title;
		this.author=book.author;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public long getVersion() {
		return version;
	}
	public void setVersion(long version) {
		this.version = version;
	}
}