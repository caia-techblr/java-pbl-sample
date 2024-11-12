public class Book {
	int bookId;
	String bookTitle;
	String bookAuthor;
	double bookPrice;
	int numPages;
	public Book(int id,String title, String author, double price, int nPages) {
		bookId=id;
		bookTitle=title;
		bookAuthor=author;
		bookPrice=price;
		numPages=nPages;
	}
	public int getId() { return bookId; }
	public String getTitle() { return bookTitle; }
	public double getPrice() { return bookPrice; }
	public void display() {
		
	}
	//get functions
	//updatePrice
}
